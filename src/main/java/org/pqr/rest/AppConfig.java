package org.pqr.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(value = "/v1")
public class AppConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        final Set<Class<?>> classes = new HashSet<>();
        // register root resources, providers
        classes.add(AwesomeService.class);
        return classes;
    }

}