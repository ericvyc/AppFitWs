package com.eric.appfit.ws.configuration;

import com.eric.appfit.ws.resource.TestResource;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

/**
 * Created by ericvyc on 26/11/16.
 */
public class GuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new JerseyServletModule() {
            @Override
            protected void configureServlets() {
                // Must configure at least one JAX-RS resource or the
                // server will fail to start.
                bind(TestResource.class);
                bind(GuicyInterface.class).to(GuicyInterfaceImpl.class);

                // Route all requests through GuiceContainer
                serve("/*").with(GuiceContainer.class);
            }
        });
    }

}
