package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.test.dev.Hello;

public class HelloTestTestNG {

    @Test
    public void helloTest(){
        Hello hello = new Hello();
        Assert.assertEquals(hello.sayHello(), "Welcome to java unit testing framework class");

    }

}
