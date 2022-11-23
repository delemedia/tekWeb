package com.example.teknologiweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TekController {


    @GetMapping("/")
    public String index() {

        return "index";

    }

    @GetMapping("/eksamen1")
    public String eksamen1() {

        return "eksamen1";
    }

    @GetMapping("/eksamen2")
    public String eksamen2() {

        return "eksamen2";
    }

    @GetMapping("/eksamen3")
    public String eksamen3() {

        return "eksamen3";
    }

    @GetMapping("/eksamen4")
    public String eksamen4() {

        return "eksamen4";
    }

    @GetMapping("/webservice")
    public String webservice() {

        return "webservice";
    }

}
