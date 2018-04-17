package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "testJsp/hello";
    }

    @RequestMapping("/helloWord")
    String helloWord(){
        return "testJsp/main";
    }
}
