/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.furnace.container.guice.mock;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public class MockModule implements Module
{

   @Override
   public void configure(Binder binder)
   {
      binder.bind(MockInterface.class).to(MockService.class);
   }

}
