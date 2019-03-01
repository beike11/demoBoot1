package com.stevenw.demoBoot1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping("/getData")
    @ResponseBody
    public Object getData(){
        Map<String,Object> data = new HashMap<>();
        data.put("1",1);
        data.put("2",2);
        return data;
    }
}
