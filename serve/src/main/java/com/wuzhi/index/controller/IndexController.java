package com.wuzhi.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "pages/index";
    }

    @RequestMapping("/back")
    public String back(){
        return "pages/back-index";
    }
}
