package com.eric.appfit.ws.resource;

import com.eric.appfit.ws.dao.UsuarioDao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by ericvyc on 26/11/16.
 */
@Path("/teste")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource {

    private UsuarioDao dao;

    @Inject
    private void setDao(UsuarioDao dao){
        this.dao = dao;
    }

    @GET
    @Path("/todos")
    public Response hello(){
        return Response.ok(dao.findAll()).build();
    }

}
