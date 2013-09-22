package com.kaz3t.proto.open;

import javax.inject.Named;
import javax.ws.rs.GET;

@Named("openResource")
public class OpenResourceImpl implements OpenResource {

    @Override
    @GET
    public String index() {
        return "Resource accessible to everybody";
    }

}
