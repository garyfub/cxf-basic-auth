package com.kaz3t.proto.secured;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/secured")
@Produces(MediaType.APPLICATION_JSON)
public interface SecuredResource {

    @GET
    public String index();
    
}
