package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 326944 on 2017/7/12.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
    return "index";
    }
}
