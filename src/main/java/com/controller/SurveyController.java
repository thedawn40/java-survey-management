package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {
    
    @GetMapping({ "/survey" })
    public String index(){
        return "survey";
    }

    @GetMapping({ "/survey-entry" })
    public String entry(){
        return "survey-entry";
    }

}
