package com.lsw.test;


import com.lsw.learning.FirstService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-config.xml" })
public class FirstServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private FirstService firstService;

    @Test
    public  void testFirstService(){
        firstService.sayHello();
    }
}
