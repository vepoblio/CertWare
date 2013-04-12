/** Import statements for il1 classes. */
import edu.ucla.belief.*;
import edu.ucla.belief.inference.*;
import edu.ucla.belief.inference.map.*;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.util.*;

/** Import statements for standard Java classes. */
import java.util.*;

/**
  This class demonstrates code for a MAP query

  To compile this class, make sure
  inflib.jar occurs in the command line classpath,
  e.g. javac -classpath inflib.jar MAPTutorial.java

  To run it, do the same,
  but also include the path to
  the compiled class,
  e.g. java -classpath .:inflib.jar MAPTutorial

  @author Keith Cascio
  @since Mar 23, 2011 6:31:36 PM
*/
public class MAPTutorial
{
  /** Test. */
  public static void main(String[] args){
    MAPTutorial T = new MAPTutorial();
    T.doMAP( T.readNetworkFile() );
  }

  /**
    Demonstrates a MAP query.
  */
  public void doMAP( BeliefNetwork bn )
  {
    /* Define evidence, by id. */
    Map evidence = Collections.EMPTY_MAP;

    /* Define the set of MAP variables, by id. */
    Set setMAPVariables = new HashSet();
    String[] arrayMAPVariableIDs = new String[] { "A" };
    for( int i=0; i<arrayMAPVariableIDs.length; i++ ){
      setMAPVariables.add( bn.forID( arrayMAPVariableIDs[i] ) );
    }

    /* Approximate MAP. */

    /* Prune first. */
    BeliefNetwork networkUnpruned = bn;
    Set varsUnpruned = setMAPVariables;
    Map evidenceUnpruned = evidence;

    Map oldToNew = new HashMap( networkUnpruned.size() );
    Map newToOld = new HashMap( networkUnpruned.size() );
    Set queryVarsPruned = new HashSet( varsUnpruned.size() );
    Map evidencePruned = new HashMap( evidenceUnpruned.size() );
    BeliefNetwork networkPruned = Prune.prune( networkUnpruned, varsUnpruned, evidenceUnpruned, oldToNew, newToOld, queryVarsPruned, evidencePruned );

    bn = networkPruned;
    setMAPVariables = queryVarsPruned;
    evidence = evidencePruned;

    /* Construct the right kind of inference engine. */
    JEngineGenerator generator = new JEngineGenerator();
    JoinTreeInferenceEngineImpl engine = generator.makeJoinTreeInferenceEngineImpl( bn, new JoinTreeSettings() );

    /* Set evidence. */
    try{
      bn.getEvidenceController().setObservations( evidencePruned );
    }catch( StateNotFoundException e ){
      System.err.println( "Error, failed to set evidence: " + e );
      return;
    };

    /*
      Define the search method, one of:
        HILL (Hill Climbing), TABOO (Taboo Search)
    */
    SearchMethod searchmethod = SearchMethod.TABOO;

    /*
      Define the initialization method, one of:
        RANDOM (Random), MPE (MPE), ML (Maximum Likelihoods), SEQ (Sequential)
    */
    InitializationMethod initializationmethod = InitializationMethod.SEQ;

    /* Define a limit on the number of search steps (default 25). */
    int steps = 25;

    /* Construct a MapRunner and run the query. */
    MapRunner maprunner = new MapRunner();
    MapRunner.MapResult mapresult = maprunner.approximateMap( bn, engine, setMAPVariables, evidence, searchmethod, initializationmethod, steps );
    Map instantiation = mapresult.instantiation;
    double score = mapresult.score;

    /* Print the results. */
    System.out.println( "Approximate MAP, P(MAP,e)= " + score );
    System.out.println( "\t P(MAP|e)= " + ( score/engine.probability() ) );
    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
    System.out.println( "\t instantiation: " + instantiation );

    /* Print timings. */
    System.out.println();
    System.out.println( "Initialization time, cpu: " + mapresult.initDurationMillisProfiled + ", elapsed: " + mapresult.initDurationMillisElapsed );
    System.out.println( "Search time, cpu: " + mapresult.searchDurationMillisProfiled + ", elapsed: " + mapresult.searchDurationMillisElapsed );
    System.out.println();

    /* Clean up to avoid memory leaks. */
    engine.die();

    return;
  }

  /**
    Open the network file used to create this tutorial.
  */
  public BeliefNetwork readNetworkFile()
  {
    String path = "/Users/mrbarryold/./Applications/samiam/network_samples/cancer_for_EM.net";

    BeliefNetwork ret = null;
    try{
      /* Use NetworkIO static method to read network file. */
      ret = NetworkIO.read( path );
    }catch( Exception e ){
      System.err.println( "Error, failed to read \"" + path + "\": " + e );
      return (BeliefNetwork)null;
    }
    return ret;
  }
}
