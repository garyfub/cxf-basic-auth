package com.kaz3t.proto.secured;

import javax.inject.Named;
import javax.ws.rs.GET;

@Named("securedResource")
public class SecuredResourceImpl implements SecuredResource {

    @Override
    @GET
    public String index() {
        return "Secured resource only for authenticated users";
    }

}
