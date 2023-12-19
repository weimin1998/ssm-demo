package com.weimin.ssmdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "main";
    }

    @GetMapping("home")
    public String home(){
        return "main";
    }
}
