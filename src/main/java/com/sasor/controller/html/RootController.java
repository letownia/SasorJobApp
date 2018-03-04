package com.sasor.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

    @RequestMapping(value={"", "/"})
    @ResponseBody
    String hello() {
        return "Home Page Bitches!";
    }

}