package com.example.demo;

import com.example.demo.service.TestSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/a")
public class HelloMac {

    @Autowired
    private TestSvc svc;

    @GetMapping("/test")
    public String helloWorld(){

        Ttest ttest = new Ttest();
        ttest.setAge(99);
        ttest.setName("hhhh");
        return "hello - world"+ttest;
    }

    @GetMapping("/sout")
    public String he22lloWorld(){
        svc.souu();
        return "success";
    }
}

