package com.mockeo.damock.controller;

import com.mockeo.damock.model.BusinessEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoParameterController {

    @PostMapping("/returnParameter")
    @ResponseBody
    public Object returnParameter(@RequestBody BusinessEntity body) {
        if (("1").equals(body.getBusinessType())){
            return "1";
        }else{
            return body;
        }

    }

}
