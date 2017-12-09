package org.pqr.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

@Path(value = "awesomeService")
public class AwesomeService {

    @GET
    @Path(value = "test")
    public String someOperation() {
        
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("foo.bar", String.class);
        
        return value;
    }

}
