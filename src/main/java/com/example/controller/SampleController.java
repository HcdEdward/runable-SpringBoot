package com.example.controller;

import com.example.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {

    @RequestMapping("/")
    String home() {
        throw new BusinessException("业务异常");
        //return "testJsp/hello";
    }

    @RequestMapping("/helloWord")
    String helloWord(){
        return "testJsp/main";
    }
}
