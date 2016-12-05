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
package org.polarsys.capella.test.diagram.tools.ju.idb;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.test.diagram.common.ju.context.IDBDiagram;
import org.polarsys.capella.test.diagram.common.ju.context.SessionContext;
import org.polarsys.capella.test.diagram.tools.ju.model.EmptyProject;
import org.polarsys.capella.test.diagram.tools.ju.model.GenericModel;

public class CreateUses extends EmptyProject {

  @Override
  public void test() throws Exception {
    Session session = getSession(getRequiredTestModel());
    SessionContext context = new SessionContext(session);

    IDBDiagram idb = IDBDiagram.createDiagram(context, LA__LOGICAL_SYSTEM);

    idb.createComponent(GenericModel.LC_1);
    idb.createInterface(GenericModel.INTERFACE_1);

    idb.createUses(GenericModel.LC_1, GenericModel.INTERFACE_1, GenericModel.INTERFACE_USE_1);

    idb.mustBeInstanceOf(GenericModel.INTERFACE_USE_1, CsPackage.Literals.INTERFACE_USE);

    idb.mustBeLinkedTo(GenericModel.INTERFACE_USE_1, GenericModel.LC_1,
        CsPackage.Literals.INTERFACE_USE__INTERFACE_USER);

    idb.mustBeLinkedTo(GenericModel.INTERFACE_USE_1, GenericModel.INTERFACE_1,
        CsPackage.Literals.INTERFACE_USE__USED_INTERFACE);

    idb.createUsesNotEnabled(GenericModel.LC_1, GenericModel.INTERFACE_1, GenericModel.INTERFACE_USE_1);

  }
}