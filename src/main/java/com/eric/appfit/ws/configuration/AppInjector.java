package com.eric.appfit.ws.configuration;

import com.eric.appfit.ws.dao.UsuarioDao;
import com.eric.appfit.ws.dao.impl.UsuarioDaoImpl;
import com.google.inject.AbstractModule;

/**
 * Created by ericvyc on 27/11/16.
 */
public class AppInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(UsuarioDao.class).to(UsuarioDaoImpl.class);
    }
}
