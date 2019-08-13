package com.test.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/12")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getStr(){
        return "123";
    }
}
