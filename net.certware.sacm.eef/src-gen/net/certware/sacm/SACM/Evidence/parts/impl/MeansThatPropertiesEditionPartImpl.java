/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Evidence.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart;

import net.certware.sacm.SACM.Evidence.providers.EvidenceMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class MeansThatPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MeansThatPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected ReferencesTable timing;
	protected List<ViewerFilter> timingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> timingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable custody;
	protected List<ViewerFilter> custodyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> custodyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable provenance;
	protected List<ViewerFilter> provenanceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> provenanceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable event;
	protected List<ViewerFilter> eventBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable attribute;
	protected List<ViewerFilter> attributeBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> attributeFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer subject;
	protected EObjectFlatComboViewer meaning;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MeansThatPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence meansThatStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = meansThatStep.addStep(EvidenceViewsRepository.MeansThat.Properties.class);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.taggedValue);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.annotation);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.id);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.timing);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.custody);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.provenance);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.event);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.attribute);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.subject);
		propertiesStep.addStep(EvidenceViewsRepository.MeansThat.Properties.meaning);
		
		
		composer = new PartComposer(meansThatStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EvidenceViewsRepository.MeansThat.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.taggedValue) {
					return createTaggedValueAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.annotation) {
					return createAnnotationAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.id) {
					return createIdText(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.timing) {
					return createTimingAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.custody) {
					return createCustodyAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.provenance) {
					return createProvenanceAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.event) {
					return createEventAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.attribute) {
					return createAttributeAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.subject) {
					return createSubjectFlatComboViewer(parent);
				}
				if (key == EvidenceViewsRepository.MeansThat.Properties.meaning) {
					return createMeaningFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EvidenceMessages.MeansThatPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTaggedValueAdvancedTableComposition(Composite parent) {
		this.taggedValue = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.taggedValue, EvidenceMessages.MeansThatPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.taggedValue, EvidenceViewsRepository.SWT_KIND));
		this.taggedValue.createControls(parent);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(EvidenceViewsRepository.MeansThat.Properties.taggedValue);
		taggedValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTaggedValueAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.annotation, EvidenceMessages.MeansThatPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.annotation, EvidenceViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(EvidenceViewsRepository.MeansThat.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.MeansThat.Properties.id, EvidenceMessages.MeansThatPropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, EvidenceViewsRepository.MeansThat.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.id, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTimingAdvancedTableComposition(Composite parent) {
		this.timing = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.timing, EvidenceMessages.MeansThatPropertiesEditionPart_TimingLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				timing.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				timing.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				timing.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				timing.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.timingFilters) {
			this.timing.addFilter(filter);
		}
		this.timing.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.timing, EvidenceViewsRepository.SWT_KIND));
		this.timing.createControls(parent);
		this.timing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.timing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData timingData = new GridData(GridData.FILL_HORIZONTAL);
		timingData.horizontalSpan = 3;
		this.timing.setLayoutData(timingData);
		this.timing.setLowerBound(0);
		this.timing.setUpperBound(-1);
		timing.setID(EvidenceViewsRepository.MeansThat.Properties.timing);
		timing.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTimingAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCustodyAdvancedTableComposition(Composite parent) {
		this.custody = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.custody, EvidenceMessages.MeansThatPropertiesEditionPart_CustodyLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				custody.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				custody.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				custody.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				custody.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.custodyFilters) {
			this.custody.addFilter(filter);
		}
		this.custody.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.custody, EvidenceViewsRepository.SWT_KIND));
		this.custody.createControls(parent);
		this.custody.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.custody, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData custodyData = new GridData(GridData.FILL_HORIZONTAL);
		custodyData.horizontalSpan = 3;
		this.custody.setLayoutData(custodyData);
		this.custody.setLowerBound(0);
		this.custody.setUpperBound(-1);
		custody.setID(EvidenceViewsRepository.MeansThat.Properties.custody);
		custody.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCustodyAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProvenanceAdvancedTableComposition(Composite parent) {
		this.provenance = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.provenance, EvidenceMessages.MeansThatPropertiesEditionPart_ProvenanceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				provenance.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				provenance.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				provenance.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				provenance.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.provenanceFilters) {
			this.provenance.addFilter(filter);
		}
		this.provenance.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.provenance, EvidenceViewsRepository.SWT_KIND));
		this.provenance.createControls(parent);
		this.provenance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.provenance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData provenanceData = new GridData(GridData.FILL_HORIZONTAL);
		provenanceData.horizontalSpan = 3;
		this.provenance.setLayoutData(provenanceData);
		this.provenance.setLowerBound(0);
		this.provenance.setUpperBound(-1);
		provenance.setID(EvidenceViewsRepository.MeansThat.Properties.provenance);
		provenance.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProvenanceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventAdvancedTableComposition(Composite parent) {
		this.event = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.event, EvidenceMessages.MeansThatPropertiesEditionPart_EventLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				event.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				event.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				event.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				event.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventFilters) {
			this.event.addFilter(filter);
		}
		this.event.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.event, EvidenceViewsRepository.SWT_KIND));
		this.event.createControls(parent);
		this.event.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.event, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		eventData.horizontalSpan = 3;
		this.event.setLayoutData(eventData);
		this.event.setLowerBound(0);
		this.event.setUpperBound(-1);
		event.setID(EvidenceViewsRepository.MeansThat.Properties.event);
		event.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEventAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAttributeAdvancedTableComposition(Composite parent) {
		this.attribute = new ReferencesTable(getDescription(EvidenceViewsRepository.MeansThat.Properties.attribute, EvidenceMessages.MeansThatPropertiesEditionPart_AttributeLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				attribute.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				attribute.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				attribute.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				attribute.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.attributeFilters) {
			this.attribute.addFilter(filter);
		}
		this.attribute.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.attribute, EvidenceViewsRepository.SWT_KIND));
		this.attribute.createControls(parent);
		this.attribute.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.attribute, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attributeData.horizontalSpan = 3;
		this.attribute.setLayoutData(attributeData);
		this.attribute.setLowerBound(0);
		this.attribute.setUpperBound(-1);
		attribute.setID(EvidenceViewsRepository.MeansThat.Properties.attribute);
		attribute.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAttributeAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSubjectFlatComboViewer(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.MeansThat.Properties.subject, EvidenceMessages.MeansThatPropertiesEditionPart_SubjectLabel);
		subject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.MeansThat.Properties.subject, EvidenceViewsRepository.SWT_KIND));
		subject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		subject.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.subject, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSubject()));
			}

		});
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subject.setLayoutData(subjectData);
		subject.setID(EvidenceViewsRepository.MeansThat.Properties.subject);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.subject, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSubjectFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMeaningFlatComboViewer(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.MeansThat.Properties.meaning, EvidenceMessages.MeansThatPropertiesEditionPart_MeaningLabel);
		meaning = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.MeansThat.Properties.meaning, EvidenceViewsRepository.SWT_KIND));
		meaning.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		meaning.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeansThatPropertiesEditionPartImpl.this, EvidenceViewsRepository.MeansThat.Properties.meaning, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMeaning()));
			}

		});
		GridData meaningData = new GridData(GridData.FILL_HORIZONTAL);
		meaning.setLayoutData(meaningData);
		meaning.setID(EvidenceViewsRepository.MeansThat.Properties.meaning);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.MeansThat.Properties.meaning, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMeaningFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTaggedValue(ViewerFilter filter) {
		taggedValueFilters.add(filter);
		if (this.taggedValue != null) {
			this.taggedValue.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
		if (this.annotation != null) {
			this.annotation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initTiming(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTiming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		timing.setContentProvider(contentProvider);
		timing.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.timing);
		if (eefElementEditorReadOnlyState && timing.isEnabled()) {
			timing.setEnabled(false);
			timing.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timing.isEnabled()) {
			timing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateTiming()
	 * 
	 */
	public void updateTiming() {
	timing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterTiming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTiming(ViewerFilter filter) {
		timingFilters.add(filter);
		if (this.timing != null) {
			this.timing.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterTiming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTiming(ViewerFilter filter) {
		timingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInTimingTable(EObject element)
	 * 
	 */
	public boolean isContainedInTimingTable(EObject element) {
		return ((ReferencesTableSettings)timing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initCustody(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCustody(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		custody.setContentProvider(contentProvider);
		custody.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.custody);
		if (eefElementEditorReadOnlyState && custody.isEnabled()) {
			custody.setEnabled(false);
			custody.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !custody.isEnabled()) {
			custody.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateCustody()
	 * 
	 */
	public void updateCustody() {
	custody.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterCustody(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCustody(ViewerFilter filter) {
		custodyFilters.add(filter);
		if (this.custody != null) {
			this.custody.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterCustody(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCustody(ViewerFilter filter) {
		custodyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInCustodyTable(EObject element)
	 * 
	 */
	public boolean isContainedInCustodyTable(EObject element) {
		return ((ReferencesTableSettings)custody.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initProvenance(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProvenance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		provenance.setContentProvider(contentProvider);
		provenance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.provenance);
		if (eefElementEditorReadOnlyState && provenance.isEnabled()) {
			provenance.setEnabled(false);
			provenance.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !provenance.isEnabled()) {
			provenance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateProvenance()
	 * 
	 */
	public void updateProvenance() {
	provenance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterProvenance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvenance(ViewerFilter filter) {
		provenanceFilters.add(filter);
		if (this.provenance != null) {
			this.provenance.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterProvenance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvenance(ViewerFilter filter) {
		provenanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInProvenanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvenanceTable(EObject element) {
		return ((ReferencesTableSettings)provenance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initEvent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		event.setContentProvider(contentProvider);
		event.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.event);
		if (eefElementEditorReadOnlyState && event.isEnabled()) {
			event.setEnabled(false);
			event.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !event.isEnabled()) {
			event.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateEvent()
	 * 
	 */
	public void updateEvent() {
	event.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterEvent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvent(ViewerFilter filter) {
		eventFilters.add(filter);
		if (this.event != null) {
			this.event.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterEvent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvent(ViewerFilter filter) {
		eventBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInEventTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventTable(EObject element) {
		return ((ReferencesTableSettings)event.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initAttribute(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAttribute(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		attribute.setContentProvider(contentProvider);
		attribute.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.attribute);
		if (eefElementEditorReadOnlyState && attribute.isEnabled()) {
			attribute.setEnabled(false);
			attribute.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attribute.isEnabled()) {
			attribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#updateAttribute()
	 * 
	 */
	public void updateAttribute() {
	attribute.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAttribute(ViewerFilter filter) {
		attributeFilters.add(filter);
		if (this.attribute != null) {
			this.attribute.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attributeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#isContainedInAttributeTable(EObject element)
	 * 
	 */
	public boolean isContainedInAttributeTable(EObject element) {
		return ((ReferencesTableSettings)attribute.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#getSubject()
	 * 
	 */
	public EObject getSubject() {
		if (subject.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) subject.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initSubject(EObjectFlatComboSettings)
	 */
	public void initSubject(EObjectFlatComboSettings settings) {
		subject.setInput(settings);
		if (current != null) {
			subject.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#setSubject(EObject newValue)
	 * 
	 */
	public void setSubject(EObject newValue) {
		if (newValue != null) {
			subject.setSelection(new StructuredSelection(newValue));
		} else {
			subject.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#setSubjectButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSubjectButtonMode(ButtonsModeEnum newValue) {
		subject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubject(ViewerFilter filter) {
		subject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubject(ViewerFilter filter) {
		subject.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#getMeaning()
	 * 
	 */
	public EObject getMeaning() {
		if (meaning.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) meaning.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#initMeaning(EObjectFlatComboSettings)
	 */
	public void initMeaning(EObjectFlatComboSettings settings) {
		meaning.setInput(settings);
		if (current != null) {
			meaning.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.meaning);
		if (eefElementEditorReadOnlyState && meaning.isEnabled()) {
			meaning.setEnabled(false);
			meaning.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !meaning.isEnabled()) {
			meaning.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#setMeaning(EObject newValue)
	 * 
	 */
	public void setMeaning(EObject newValue) {
		if (newValue != null) {
			meaning.setSelection(new StructuredSelection(newValue));
		} else {
			meaning.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.MeansThat.Properties.meaning);
		if (eefElementEditorReadOnlyState && meaning.isEnabled()) {
			meaning.setEnabled(false);
			meaning.setToolTipText(EvidenceMessages.MeansThat_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !meaning.isEnabled()) {
			meaning.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#setMeaningButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMeaningButtonMode(ButtonsModeEnum newValue) {
		meaning.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addFilterMeaning(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMeaning(ViewerFilter filter) {
		meaning.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.MeansThatPropertiesEditionPart#addBusinessFilterMeaning(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMeaning(ViewerFilter filter) {
		meaning.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EvidenceMessages.MeansThat_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}