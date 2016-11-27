package com.eric.appfit.ws.configuration;

import com.eric.appfit.ws.resource.TestResource;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by ericvyc on 27/11/16.
 */
public class ClientApplication {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new AppInjector());
        TestResource testResource = injector.getInstance(TestResource.class);
        testResource.hello();
    }

}
