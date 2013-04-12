package net.certware.evidence.hugin.view.testers;

import net.certware.evidence.hugin.view.ViewTree;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * Property tester for view content selections.
 * @author mrb
 * @since 1.2.1
 */
public class SelectedTester extends PropertyTester
{

  /**
   * Constructor empty.
   */
  public SelectedTester() {
  }

  /**
   * Tests whether the view has been loaded with model content and contains selections.
   * Use <code>isSelected</code> appended as property to extension name space for test.
   * @param receiver unused
   * @param property test string "isSelected" or "isNotSelected"
   * @param args unused
   * @param expectedValue unused
   * @return boolean true if view active condition matches test property 
   * @see org.eclipse.core.expressions.IPropertyTester#test(Object, String, Object[], Object)  
   */
  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
  {
    boolean selected = false;
    IWorkbenchPart wp; 
    
    try {
      // some can be null during launch
      wp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
      if ( ! (wp instanceof ViewTree) )
        return false;
    } catch( Exception e ) { // $codepro.audit.disable logExceptions
      return false;
    }
    
    try {
      ViewTree viewTree = (ViewTree)wp;
      selected = viewTree.hasVariableSelections();
    } catch( Exception e ) {
      System.err.println(String.format("%s %s", "View tree selection tester",e.getMessage())); //$NON-NLS-1$
    }
    
    if ( "isSelected".equals(property) ) //$NON-NLS-1$
      return selected;
    
    if ( "isNotSelected".equals(property)) //$NON-NLS-1$
      return !selected;

    return false;
  }

}
