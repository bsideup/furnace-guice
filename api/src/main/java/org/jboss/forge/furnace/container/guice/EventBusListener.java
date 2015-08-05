/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.furnace.container.guice;

import com.google.common.eventbus.EventBus;

/**
 * Fired when the addon is started
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface EventBusListener
{
   public void register(EventBus eventBus);
}
