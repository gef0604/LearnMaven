package com.gef;

import org.junit.Test;
import static junit.framework.Assert.*;

public class MyMavenLearnTest {
    @Test
    public void testMyMavenLearn(){
        MyMavenLearn mml = new MyMavenLearn();
        String res = mml.sayHello("maven");
        assertEquals("Hello maven!", res);
    }
}
