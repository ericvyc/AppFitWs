package com.eric.appfit.ws.dao.impl;

import com.eric.appfit.ws.dao.UsuarioDao;
import com.eric.appfit.ws.model.Usuario;

import javax.inject.Singleton;
import java.util.List;

/**
 * Created by ericvyc on 27/11/16.
 */
@Singleton
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public Usuario save(Usuario entity) {
        return save(entity);
    }

    @Override
    public Usuario update(Usuario entity) {
        return update(entity);
    }

    @Override
    public void remove(Long id) {
        remove(id);
    }

    @Override
    public List<Usuario> findAll() {
        return findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return findById(id);
    }
}
