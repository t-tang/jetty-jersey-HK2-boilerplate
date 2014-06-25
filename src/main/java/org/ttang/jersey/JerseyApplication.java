package org.ttang.jersey;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(new JerseyApplicationBinder());
    }
}