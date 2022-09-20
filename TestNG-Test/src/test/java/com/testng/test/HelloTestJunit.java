package com.testng.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testng.test.dev.Hello;

public class HelloTestJunit {

    @Test
    public void helloTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("Welcome to java unit testing framework class",hello.sayHello());

    }



}
