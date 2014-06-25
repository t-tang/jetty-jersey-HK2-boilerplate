package org.ttang.jersey;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class JerseyApplicationBinder extends AbstractBinder {

    @Override
    /* Clunky, need to identify all classes to HK2-Lite */
    protected void configure() {
        //bind(MyClass.class).to(MyClass.class);
    }
}
