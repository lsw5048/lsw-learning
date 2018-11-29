package com.lsw.learning.impl;

import com.lsw.learning.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    @Value("#{configProperties['whatToSay']}")
    private String say1;
    @Value("what.to.say.in.properties")
    private String say2;

    @Override
    public void sayHello() {
        System.out.println("Hello, " + say1+say2);
    }
}
