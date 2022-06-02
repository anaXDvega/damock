package com.mockeo.damock.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {


    @PostMapping("/returnSameRequest")
    @ResponseBody
    public Object returnSameRequest(@RequestBody Object body) {
        return body;
    }


}
