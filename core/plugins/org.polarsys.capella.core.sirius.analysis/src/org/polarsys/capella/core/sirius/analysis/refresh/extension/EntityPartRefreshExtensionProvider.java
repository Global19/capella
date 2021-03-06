/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.analysis.refresh.extension;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtensionProvider;
import org.polarsys.capella.core.sirius.analysis.IDiagramNameConstants;

public class EntityPartRefreshExtensionProvider implements
		IRefreshExtensionProvider {

	private static final EntityPartRefreshExtension REFRESH_EXTENSION = new EntityPartRefreshExtension();

	
	public EntityPartRefreshExtensionProvider() {
	}

	public IRefreshExtension getRefreshExtension(DDiagram viewPoint_p) {
		 return REFRESH_EXTENSION;
	}

	public boolean provides(DDiagram viewPoint_p) {
		 return (IDiagramNameConstants.OPERATIONAL_CAPABILITIES_ENTITYIES_BLANK_DIAGRAM_NAME.equals(viewPoint_p.getDescription().getName()));
	}

}
