package com.codewithpratik.productservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class HelloWorldController {
    @GetMapping("/hello/{name}/{noOfTimes}")
//    @ResponseBody
    public String hello(@PathVariable String name,
                        @PathVariable int noOfTimes) {
        String response = "";
        for (int i=0; i<noOfTimes; i++) {
            String s = "Hello World " + name + "<br>";
            response += s;
        }
        return response;
    }

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }

}
