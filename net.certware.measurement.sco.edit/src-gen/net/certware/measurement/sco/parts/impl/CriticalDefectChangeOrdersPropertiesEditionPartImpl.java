/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.impl;

// Start of user code for imports
import net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
public class CriticalDefectChangeOrdersPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CriticalDefectChangeOrdersPropertiesEditionPart {

	protected Text name;
	protected Text value;
	protected EMFComboViewer type;
	protected Text brokenLines;
	protected Text fixedLines;
	protected Text repairEffort;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CriticalDefectChangeOrdersPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence criticalDefectChangeOrdersStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = criticalDefectChangeOrdersStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.class);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.name);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.value);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines);
		propertiesStep.addStep(ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort);
		
		
		composer = new PartComposer(criticalDefectChangeOrdersStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.name) {
					return createNameText(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.value) {
					return createValueText(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines) {
					return createBrokenLinesText(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines) {
					return createFixedLinesText(parent);
				}
				if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort) {
					return createRepairEffortText(parent);
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
		propertiesGroup.setText(ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.name, ScoViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ScoViewsRepository.CriticalDefectChangeOrders.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.name, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.value, ScoViewsRepository.SWT_KIND));
		value = new Text(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, ScoViewsRepository.CriticalDefectChangeOrders.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.value, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type, ScoViewsRepository.SWT_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBrokenLinesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_BrokenLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines, ScoViewsRepository.SWT_KIND));
		brokenLines = new Text(parent, SWT.BORDER);
		GridData brokenLinesData = new GridData(GridData.FILL_HORIZONTAL);
		brokenLines.setLayoutData(brokenLinesData);
		brokenLines.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
			}

		});
		brokenLines.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
				}
			}

		});
		EditingUtils.setID(brokenLines, ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines);
		EditingUtils.setEEFtype(brokenLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFixedLinesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_FixedLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines, ScoViewsRepository.SWT_KIND));
		fixedLines = new Text(parent, SWT.BORDER);
		GridData fixedLinesData = new GridData(GridData.FILL_HORIZONTAL);
		fixedLines.setLayoutData(fixedLinesData);
		fixedLines.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
			}

		});
		fixedLines.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
				}
			}

		});
		EditingUtils.setID(fixedLines, ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines);
		EditingUtils.setEEFtype(fixedLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRepairEffortText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.CriticalDefectChangeOrdersPropertiesEditionPart_RepairEffortLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort, ScoViewsRepository.SWT_KIND));
		repairEffort = new Text(parent, SWT.BORDER);
		GridData repairEffortData = new GridData(GridData.FILL_HORIZONTAL);
		repairEffort.setLayoutData(repairEffortData);
		repairEffort.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
			}

		});
		repairEffort.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriticalDefectChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
				}
			}

		});
		EditingUtils.setID(repairEffort, ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort);
		EditingUtils.setEEFtype(repairEffort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getBrokenLines()
	 * 
	 */
	public String getBrokenLines() {
		return brokenLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setBrokenLines(String newValue)
	 * 
	 */
	public void setBrokenLines(String newValue) {
		if (newValue != null) {
			brokenLines.setText(newValue);
		} else {
			brokenLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getFixedLines()
	 * 
	 */
	public String getFixedLines() {
		return fixedLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setFixedLines(String newValue)
	 * 
	 */
	public void setFixedLines(String newValue) {
		if (newValue != null) {
			fixedLines.setText(newValue);
		} else {
			fixedLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#getRepairEffort()
	 * 
	 */
	public String getRepairEffort() {
		return repairEffort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart#setRepairEffort(String newValue)
	 * 
	 */
	public void setRepairEffort(String newValue) {
		if (newValue != null) {
			repairEffort.setText(newValue);
		} else {
			repairEffort.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.CriticalDefectChangeOrders_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
