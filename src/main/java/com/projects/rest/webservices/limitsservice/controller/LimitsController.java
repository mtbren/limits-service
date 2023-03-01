package com.projects.rest.webservices.limitsservice.controller;

import com.projects.rest.webservices.limitsservice.entity.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping(path = "/limits")
    public Limits retrieveLimits(){
        return new Limits(1,1000);
    }
}
