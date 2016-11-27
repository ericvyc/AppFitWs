package com.eric.appfit.ws.configuration;

/**
 * Created by ericvyc on 26/11/16.
 */
public class GuicyInterfaceImpl implements  GuicyInterface {
    @Override
    public String get() {
        return GuicyInterfaceImpl.class.getName();
    }
}
