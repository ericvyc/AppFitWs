package com.eric.appfit.ws.resource;

import com.eric.appfit.ws.configuration.GuicyInterface;
import com.google.inject.Inject;

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

    private final GuicyInterface gi;

    @Inject
    public TestResource(final GuicyInterface gi){
        this.gi = gi;
    }

    @GET
    public Response hello(@QueryParam("x") String x){
        String resposta = "Deu certo: " + gi.toString() + " Parâmetro:" + x;
        return Response.ok(resposta).build();
    }

}
