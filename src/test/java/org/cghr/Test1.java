package org.cghr;

/**
 * Created by mahtab on 7/4/17.
 */
import junit.framework.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void testPrintHelloWorld() {

        Assert.assertEquals(App.getHelloWorld(), "Hello World");

    }

}