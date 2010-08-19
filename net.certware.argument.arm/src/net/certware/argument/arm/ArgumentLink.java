/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 Kestrel Technology LLC (generated models) 
 */
package net.certware.argument.arm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.arm.ArgumentLink#getTarget <em>Target</em>}</li>
 *   <li>{@link net.certware.argument.arm.ArgumentLink#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.arm.ArmPackage#getArgumentLink()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentLink extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 Kestrel Technology LLC (generated models) "; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.arm.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgumentLink_Target()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.arm.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgumentLink_Source()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getSource();

} // ArgumentLink
