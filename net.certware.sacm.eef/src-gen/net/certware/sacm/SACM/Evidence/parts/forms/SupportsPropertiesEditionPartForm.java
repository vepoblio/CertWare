/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Evidence.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart;

import net.certware.sacm.SACM.Evidence.providers.EvidenceMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class SupportsPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SupportsPropertiesEditionPart {

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
	protected EObjectFlatComboViewer assertion;
	protected EObjectFlatComboViewer subject;



	/**
	 * For {@link ISection} use only.
	 */
	public SupportsPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SupportsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence supportsStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = supportsStep.addStep(EvidenceViewsRepository.Supports.Properties.class);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.taggedValue);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.annotation);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.id);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.timing);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.custody);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.provenance);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.event);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.attribute);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.assertion);
		propertiesStep.addStep(EvidenceViewsRepository.Supports.Properties.subject);
		
		
		composer = new PartComposer(supportsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EvidenceViewsRepository.Supports.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.taggedValue) {
					return createTaggedValueTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.annotation) {
					return createAnnotationTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.timing) {
					return createTimingTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.custody) {
					return createCustodyTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.provenance) {
					return createProvenanceTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.event) {
					return createEventTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.attribute) {
					return createAttributeTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.assertion) {
					return createAssertionFlatComboViewer(parent, widgetFactory);
				}
				if (key == EvidenceViewsRepository.Supports.Properties.subject) {
					return createSubjectFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EvidenceMessages.SupportsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTaggedValueTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.taggedValue = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.taggedValue, EvidenceMessages.SupportsPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.taggedValue, EvidenceViewsRepository.FORM_KIND));
		this.taggedValue.createControls(parent, widgetFactory);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(EvidenceViewsRepository.Supports.Properties.taggedValue);
		taggedValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTaggedValueTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.annotation = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.annotation, EvidenceMessages.SupportsPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.annotation, EvidenceViewsRepository.FORM_KIND));
		this.annotation.createControls(parent, widgetFactory);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(EvidenceViewsRepository.Supports.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EvidenceViewsRepository.Supports.Properties.id, EvidenceMessages.SupportsPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SupportsPropertiesEditionPartForm.this,
							EvidenceViewsRepository.Supports.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SupportsPropertiesEditionPartForm.this,
									EvidenceViewsRepository.Supports.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SupportsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, EvidenceViewsRepository.Supports.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.id, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTimingTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.timing = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.timing, EvidenceMessages.SupportsPropertiesEditionPart_TimingLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				timing.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				timing.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				timing.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				timing.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.timingFilters) {
			this.timing.addFilter(filter);
		}
		this.timing.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.timing, EvidenceViewsRepository.FORM_KIND));
		this.timing.createControls(parent, widgetFactory);
		this.timing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.timing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData timingData = new GridData(GridData.FILL_HORIZONTAL);
		timingData.horizontalSpan = 3;
		this.timing.setLayoutData(timingData);
		this.timing.setLowerBound(0);
		this.timing.setUpperBound(-1);
		timing.setID(EvidenceViewsRepository.Supports.Properties.timing);
		timing.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTimingTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCustodyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.custody = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.custody, EvidenceMessages.SupportsPropertiesEditionPart_CustodyLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				custody.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				custody.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				custody.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				custody.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.custodyFilters) {
			this.custody.addFilter(filter);
		}
		this.custody.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.custody, EvidenceViewsRepository.FORM_KIND));
		this.custody.createControls(parent, widgetFactory);
		this.custody.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.custody, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData custodyData = new GridData(GridData.FILL_HORIZONTAL);
		custodyData.horizontalSpan = 3;
		this.custody.setLayoutData(custodyData);
		this.custody.setLowerBound(0);
		this.custody.setUpperBound(-1);
		custody.setID(EvidenceViewsRepository.Supports.Properties.custody);
		custody.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCustodyTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProvenanceTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.provenance = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.provenance, EvidenceMessages.SupportsPropertiesEditionPart_ProvenanceLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				provenance.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				provenance.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				provenance.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				provenance.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.provenanceFilters) {
			this.provenance.addFilter(filter);
		}
		this.provenance.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.provenance, EvidenceViewsRepository.FORM_KIND));
		this.provenance.createControls(parent, widgetFactory);
		this.provenance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.provenance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData provenanceData = new GridData(GridData.FILL_HORIZONTAL);
		provenanceData.horizontalSpan = 3;
		this.provenance.setLayoutData(provenanceData);
		this.provenance.setLowerBound(0);
		this.provenance.setUpperBound(-1);
		provenance.setID(EvidenceViewsRepository.Supports.Properties.provenance);
		provenance.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProvenanceTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.event = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.event, EvidenceMessages.SupportsPropertiesEditionPart_EventLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				event.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				event.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				event.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				event.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventFilters) {
			this.event.addFilter(filter);
		}
		this.event.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.event, EvidenceViewsRepository.FORM_KIND));
		this.event.createControls(parent, widgetFactory);
		this.event.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.event, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		eventData.horizontalSpan = 3;
		this.event.setLayoutData(eventData);
		this.event.setLowerBound(0);
		this.event.setUpperBound(-1);
		event.setID(EvidenceViewsRepository.Supports.Properties.event);
		event.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEventTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAttributeTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.attribute = new ReferencesTable(getDescription(EvidenceViewsRepository.Supports.Properties.attribute, EvidenceMessages.SupportsPropertiesEditionPart_AttributeLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				attribute.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				attribute.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				attribute.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				attribute.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.attributeFilters) {
			this.attribute.addFilter(filter);
		}
		this.attribute.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.attribute, EvidenceViewsRepository.FORM_KIND));
		this.attribute.createControls(parent, widgetFactory);
		this.attribute.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.attribute, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attributeData.horizontalSpan = 3;
		this.attribute.setLayoutData(attributeData);
		this.attribute.setLowerBound(0);
		this.attribute.setUpperBound(-1);
		attribute.setID(EvidenceViewsRepository.Supports.Properties.attribute);
		attribute.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAttributeTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAssertionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EvidenceViewsRepository.Supports.Properties.assertion, EvidenceMessages.SupportsPropertiesEditionPart_AssertionLabel);
		assertion = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.Supports.Properties.assertion, EvidenceViewsRepository.FORM_KIND));
		widgetFactory.adapt(assertion);
		assertion.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData assertionData = new GridData(GridData.FILL_HORIZONTAL);
		assertion.setLayoutData(assertionData);
		assertion.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.assertion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAssertion()));
			}

		});
		assertion.setID(EvidenceViewsRepository.Supports.Properties.assertion);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.assertion, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAssertionFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSubjectFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EvidenceViewsRepository.Supports.Properties.subject, EvidenceMessages.SupportsPropertiesEditionPart_SubjectLabel);
		subject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.Supports.Properties.subject, EvidenceViewsRepository.FORM_KIND));
		widgetFactory.adapt(subject);
		subject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subject.setLayoutData(subjectData);
		subject.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SupportsPropertiesEditionPartForm.this, EvidenceViewsRepository.Supports.Properties.subject, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSubject()));
			}

		});
		subject.setID(EvidenceViewsRepository.Supports.Properties.subject);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Supports.Properties.subject, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSubjectFlatComboViewer

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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initTiming(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTiming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		timing.setContentProvider(contentProvider);
		timing.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.timing);
		if (eefElementEditorReadOnlyState && timing.isEnabled()) {
			timing.setEnabled(false);
			timing.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timing.isEnabled()) {
			timing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateTiming()
	 * 
	 */
	public void updateTiming() {
	timing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterTiming(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterTiming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTiming(ViewerFilter filter) {
		timingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInTimingTable(EObject element)
	 * 
	 */
	public boolean isContainedInTimingTable(EObject element) {
		return ((ReferencesTableSettings)timing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initCustody(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCustody(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		custody.setContentProvider(contentProvider);
		custody.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.custody);
		if (eefElementEditorReadOnlyState && custody.isEnabled()) {
			custody.setEnabled(false);
			custody.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !custody.isEnabled()) {
			custody.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateCustody()
	 * 
	 */
	public void updateCustody() {
	custody.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterCustody(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterCustody(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCustody(ViewerFilter filter) {
		custodyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInCustodyTable(EObject element)
	 * 
	 */
	public boolean isContainedInCustodyTable(EObject element) {
		return ((ReferencesTableSettings)custody.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initProvenance(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProvenance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		provenance.setContentProvider(contentProvider);
		provenance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.provenance);
		if (eefElementEditorReadOnlyState && provenance.isEnabled()) {
			provenance.setEnabled(false);
			provenance.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !provenance.isEnabled()) {
			provenance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateProvenance()
	 * 
	 */
	public void updateProvenance() {
	provenance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterProvenance(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterProvenance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvenance(ViewerFilter filter) {
		provenanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInProvenanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvenanceTable(EObject element) {
		return ((ReferencesTableSettings)provenance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initEvent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		event.setContentProvider(contentProvider);
		event.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.event);
		if (eefElementEditorReadOnlyState && event.isEnabled()) {
			event.setEnabled(false);
			event.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !event.isEnabled()) {
			event.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateEvent()
	 * 
	 */
	public void updateEvent() {
	event.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterEvent(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterEvent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvent(ViewerFilter filter) {
		eventBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInEventTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventTable(EObject element) {
		return ((ReferencesTableSettings)event.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initAttribute(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAttribute(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		attribute.setContentProvider(contentProvider);
		attribute.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.attribute);
		if (eefElementEditorReadOnlyState && attribute.isEnabled()) {
			attribute.setEnabled(false);
			attribute.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attribute.isEnabled()) {
			attribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#updateAttribute()
	 * 
	 */
	public void updateAttribute() {
	attribute.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attributeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#isContainedInAttributeTable(EObject element)
	 * 
	 */
	public boolean isContainedInAttributeTable(EObject element) {
		return ((ReferencesTableSettings)attribute.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#getAssertion()
	 * 
	 */
	public EObject getAssertion() {
		if (assertion.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) assertion.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initAssertion(EObjectFlatComboSettings)
	 */
	public void initAssertion(EObjectFlatComboSettings settings) {
		assertion.setInput(settings);
		if (current != null) {
			assertion.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.assertion);
		if (eefElementEditorReadOnlyState && assertion.isEnabled()) {
			assertion.setEnabled(false);
			assertion.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assertion.isEnabled()) {
			assertion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#setAssertion(EObject newValue)
	 * 
	 */
	public void setAssertion(EObject newValue) {
		if (newValue != null) {
			assertion.setSelection(new StructuredSelection(newValue));
		} else {
			assertion.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.assertion);
		if (eefElementEditorReadOnlyState && assertion.isEnabled()) {
			assertion.setEnabled(false);
			assertion.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assertion.isEnabled()) {
			assertion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#setAssertionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAssertionButtonMode(ButtonsModeEnum newValue) {
		assertion.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterAssertion(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssertion(ViewerFilter filter) {
		assertion.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterAssertion(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssertion(ViewerFilter filter) {
		assertion.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#getSubject()
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
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#initSubject(EObjectFlatComboSettings)
	 */
	public void initSubject(EObjectFlatComboSettings settings) {
		subject.setInput(settings);
		if (current != null) {
			subject.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#setSubject(EObject newValue)
	 * 
	 */
	public void setSubject(EObject newValue) {
		if (newValue != null) {
			subject.setSelection(new StructuredSelection(newValue));
		} else {
			subject.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Supports.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.Supports_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#setSubjectButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSubjectButtonMode(ButtonsModeEnum newValue) {
		subject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubject(ViewerFilter filter) {
		subject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.SupportsPropertiesEditionPart#addBusinessFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubject(ViewerFilter filter) {
		subject.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EvidenceMessages.Supports_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}