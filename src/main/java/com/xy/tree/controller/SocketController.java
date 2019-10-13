package com.xy.tree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocketController {

    @RequestMapping("/hello.do")
    public String socket(){
        System.out.println("....");
        return "index";
    }
}
