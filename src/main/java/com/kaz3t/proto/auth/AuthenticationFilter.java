package com.kaz3t.proto.auth;

import javax.inject.Named;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

@Named
public class AuthenticationFilter implements RequestHandler {

    @Override
    public Response handleRequest(Message message, ClassResourceInfo resource) {
        Path path = resource.getPath();

        if (path.value().equals("/secured")) {
            AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy) message
                    .get(AuthorizationPolicy.class);
            
            if (authorizationPolicy == null) {
                return Response.status(401).header("WWW-Authenticate", "Basic").build();
            }
            
            String username = authorizationPolicy.getUserName();
            String password = authorizationPolicy.getPassword();
            
            if (username.equals("foo") && password.equals("bar")) {
                return null;
            } else {
                return Response.status(401).header("WWW-Authenticate", "Basic").build();
            }
        }

        return null;
    }

}
