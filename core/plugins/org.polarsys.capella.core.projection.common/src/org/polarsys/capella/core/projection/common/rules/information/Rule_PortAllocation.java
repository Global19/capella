/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.projection.common.rules.information;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.projection.common.context.IContext;
import org.polarsys.capella.core.projection.common.rules.core.Rule_AbstractTrace;

/**
 */
public class Rule_PortAllocation extends Rule_AbstractTrace {

  /**
   * @param sourceType_p
   * @param targetType_p
   */
  public Rule_PortAllocation() {
    super(InformationPackage.Literals.PORT_ALLOCATION, InformationPackage.Literals.PORT_ALLOCATION);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected EStructuralFeature getTargetContainementFeature(EObject element_p, EObject result_p, EObject container_p, IContext context_p) {
    return InformationPackage.Literals.PORT__OWNED_PORT_ALLOCATIONS;
  }

}