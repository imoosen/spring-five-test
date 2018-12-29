package com.imoosen.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SayHelloWorldTest {

    @Autowired
    private SayHelloWorld sayHelloWorld;

    @Test
    public void say() throws Exception {
        String result = sayHelloWorld.Say();
        System.out.println("2019 spring 5.0:"+result);
    }



}
