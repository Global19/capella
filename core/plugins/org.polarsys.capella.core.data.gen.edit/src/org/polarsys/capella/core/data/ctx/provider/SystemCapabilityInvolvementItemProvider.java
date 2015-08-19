/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.ctx.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.model.copypaste.SharedInitializeCopyCommand;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.provider.RelationshipItemProvider;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemCapabilityInvolvementItemProvider
	extends RelationshipItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IItemPropertyDescriptor involverPropertyDescriptor;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IItemPropertyDescriptor involvedPropertyDescriptor;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IItemPropertyDescriptor capabilityPropertyDescriptor;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IItemPropertyDescriptor systemPropertyDescriptor;

	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SystemCapabilityInvolvementItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void checkChildCreationExtender(Object object) {
    super.checkChildCreationExtender(object);
    if (object instanceof EObject) {
      EObject eObject = (EObject) object;
      // Process CapellacorePackage.Literals.INVOLVEMENT__INVOLVER
      if (involverPropertyDescriptor != null) {
        Object involverValue = eObject.eGet(CapellacorePackage.Literals.INVOLVEMENT__INVOLVER, true);
        if (involverValue != null && involverValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) involverValue)) {
          itemPropertyDescriptors.remove(involverPropertyDescriptor);
        } else if (involverValue == null && ExtensionModelManager.getAnyType(eObject, CapellacorePackage.Literals.INVOLVEMENT__INVOLVER) != null) {
          itemPropertyDescriptors.remove(involverPropertyDescriptor);				  					
        } else if (itemPropertyDescriptors.contains(involverPropertyDescriptor) == false) {
          itemPropertyDescriptors.add(involverPropertyDescriptor);
        }
      }
      // Process CapellacorePackage.Literals.INVOLVEMENT__INVOLVED
      if (involvedPropertyDescriptor != null) {
        Object involvedValue = eObject.eGet(CapellacorePackage.Literals.INVOLVEMENT__INVOLVED, true);
        if (involvedValue != null && involvedValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) involvedValue)) {
          itemPropertyDescriptors.remove(involvedPropertyDescriptor);
        } else if (involvedValue == null && ExtensionModelManager.getAnyType(eObject, CapellacorePackage.Literals.INVOLVEMENT__INVOLVED) != null) {
          itemPropertyDescriptors.remove(involvedPropertyDescriptor);				  					
        } else if (itemPropertyDescriptors.contains(involvedPropertyDescriptor) == false) {
          itemPropertyDescriptors.add(involvedPropertyDescriptor);
        }
      }
      // Process CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__CAPABILITY
      if (capabilityPropertyDescriptor != null) {
        Object capabilityValue = eObject.eGet(CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__CAPABILITY, true);
        if (capabilityValue != null && capabilityValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) capabilityValue)) {
          itemPropertyDescriptors.remove(capabilityPropertyDescriptor);
        } else if (capabilityValue == null && ExtensionModelManager.getAnyType(eObject, CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__CAPABILITY) != null) {
          itemPropertyDescriptors.remove(capabilityPropertyDescriptor);				  					
        } else if (itemPropertyDescriptors.contains(capabilityPropertyDescriptor) == false) {
          itemPropertyDescriptors.add(capabilityPropertyDescriptor);
        }
      }
      // Process CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__SYSTEM
      if (systemPropertyDescriptor != null) {
        Object systemValue = eObject.eGet(CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__SYSTEM, true);
        if (systemValue != null && systemValue instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) systemValue)) {
          itemPropertyDescriptors.remove(systemPropertyDescriptor);
        } else if (systemValue == null && ExtensionModelManager.getAnyType(eObject, CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__SYSTEM) != null) {
          itemPropertyDescriptors.remove(systemPropertyDescriptor);				  					
        } else if (itemPropertyDescriptors.contains(systemPropertyDescriptor) == false) {
          itemPropertyDescriptors.add(systemPropertyDescriptor);
        }
      }
    }		
  }

	/**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addInvolverPropertyDescriptor(object);
      addInvolvedPropertyDescriptor(object);
      addCapabilityPropertyDescriptor(object);
      addSystemPropertyDescriptor(object);
    }
    // begin-extension-code
    checkChildCreationExtender(object);
    // end-extension-code
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Involver feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addInvolverPropertyDescriptor(Object object) {
    // begin-extension-code
    involverPropertyDescriptor = createItemPropertyDescriptor
    // end-extension-code		
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Involvement_involver_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_Involvement_involver_feature", "_UI_Involvement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         CapellacorePackage.Literals.INVOLVEMENT__INVOLVER,
         true,
         false,
         true,
         null,
         null,
    // begin-extension-code
         null);
    itemPropertyDescriptors.add(involverPropertyDescriptor);
    // end-extension-code
  }

	/**
   * This adds a property descriptor for the Involved feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addInvolvedPropertyDescriptor(Object object) {
    // begin-extension-code
    involvedPropertyDescriptor = createItemPropertyDescriptor
    // end-extension-code		
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Involvement_involved_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_Involvement_involved_feature", "_UI_Involvement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         CapellacorePackage.Literals.INVOLVEMENT__INVOLVED,
         true,
         false,
         true,
         null,
         null,
    // begin-extension-code
         null);
    itemPropertyDescriptors.add(involvedPropertyDescriptor);
    // end-extension-code
  }

	/**
   * This adds a property descriptor for the Capability feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addCapabilityPropertyDescriptor(Object object) {
    // begin-extension-code
    capabilityPropertyDescriptor = createItemPropertyDescriptor
    // end-extension-code		
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_SystemCapabilityInvolvement_capability_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_SystemCapabilityInvolvement_capability_feature", "_UI_SystemCapabilityInvolvement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__CAPABILITY,
         false,
         false,
         false,
         null,
         null,
    // begin-extension-code
         null);
    itemPropertyDescriptors.add(capabilityPropertyDescriptor);
    // end-extension-code
  }

	/**
   * This adds a property descriptor for the System feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addSystemPropertyDescriptor(Object object) {
    // begin-extension-code
    systemPropertyDescriptor = createItemPropertyDescriptor
    // end-extension-code		
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_SystemCapabilityInvolvement_system_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_SystemCapabilityInvolvement_system_feature", "_UI_SystemCapabilityInvolvement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT__SYSTEM,
         false,
         false,
         false,
         null,
         null,
    // begin-extension-code
         null);
    itemPropertyDescriptors.add(systemPropertyDescriptor);
    // end-extension-code
  }

	/**
   * This returns SystemCapabilityInvolvement.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemCapabilityInvolvement")); //$NON-NLS-1$
  }

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
   String[] result = new String[] { null };

    	//begin-capella-code
        String label = ""; //$NON-NLS-1$
        String targetName = ""; //$NON-NLS-1$
        EObject target = null;

 		target = ((Involvement) object).getInvolved();
  
   	if (null != target) {
      if (target instanceof AbstractNamedElement) {
        targetName = ((AbstractNamedElement) target).getName();
      }

      if (null == targetName || "" == targetName) { //$NON-NLS-1$
        targetName = "[" + target.eClass().getName() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
      }
   	}
   	label = "[" + getString("_UI_SystemCapabilityInvolvement_type") + "] to " + targetName; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    
    //end-capella-code
    
  
      result[0] = label == null || label.length() == 0 ?
      //begin-capella-code
      "[" + getString("_UI_SystemCapabilityInvolvement_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      //end-capella-code

    return result[0];

  }

	/**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);
    super.notifyChanged(notification);
  }

	/**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

	// begin-capella-code
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected Command createInitializeCopyCommand(EditingDomain domain_p, EObject owner_p, Helper helper_p) {
    return new SharedInitializeCopyCommand(domain_p, owner_p, helper_p);
  }
	// end-capella-code
}
