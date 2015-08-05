/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.furnace.container.guice.events;

import java.lang.annotation.Annotation;

import org.jboss.forge.furnace.event.EventException;
import org.jboss.forge.furnace.event.EventManager;

import com.google.common.eventbus.EventBus;

/**
 * {@link EventManager} implementation for Guice
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public class GuiceEventManager implements EventManager
{
   private final EventBus eventBus;

   public GuiceEventManager(String name)
   {
      this.eventBus = new EventBus(name);
   }

   @Override
   public void fireEvent(Object event, Annotation... qualifiers) throws EventException
   {
      eventBus.post(event);
   }

   public void register(Object listener)
   {
      eventBus.register(listener);
   }

   public void unregister(Object listener)
   {
      eventBus.unregister(listener);
   }
}