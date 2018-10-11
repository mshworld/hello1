package com.dtg.hello1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Map<String,String> hello(){
        Map<String,String> s = new HashMap<>();
        s.put("name","hello1");
        return s;
    }
}
