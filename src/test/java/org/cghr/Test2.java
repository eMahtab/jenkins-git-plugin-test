package org.cghr;

/**
 * Created by mahtab on 7/4/17.
 */
import junit.framework.Assert;
import org.junit.Test;

public class Test2 {

    @Test
    public void testPrintHelloWorld2() {

        Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

    }

}