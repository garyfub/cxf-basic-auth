package com.kaz3t.proto.open;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/open")
@Produces(MediaType.APPLICATION_JSON)
public interface OpenResource {

    @GET
    public String index();

}