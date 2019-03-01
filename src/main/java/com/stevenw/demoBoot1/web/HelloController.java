package com.stevenw.demoBoot1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author stevenw
 * @date 2019/2/28
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
