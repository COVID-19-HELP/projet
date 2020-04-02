package com.covid19help.projet.controller;

import com.covid19help.projet.payload.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/covid19help/")
public class Controller {

    @GetMapping("/test")
    public RestResponse testApi(){
        return new RestResponse("Comment pouvons nous vous aidez pour luttre contre le COVID-19 ?", HttpStatus.OK, 200);
    }


}
