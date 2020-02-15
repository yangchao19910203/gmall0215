package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangchao
 * @create 2020-02-15 12:13
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello index";
    }

}
