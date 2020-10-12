package com.zh.modletest.controller;

import com.zh.modletest.property.ApplicationProperty;
import com.zh.modletest.property.DeveloperProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    public TestController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
    }


    @GetMapping("/hello")
    public  String seyHello(){
        return "hello World";
    }
    @GetMapping("/property")
    public HashMap<String,Object> getProperty(){
        HashMap<String,Object> map=new HashMap<>();
        map.put("applicationProperty",applicationProperty);
        map.put("developerProperty",developerProperty);
        return map;
    }
}
