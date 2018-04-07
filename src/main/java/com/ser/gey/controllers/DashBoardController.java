package com.ser.gey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {

    @GetMapping("/")
    String getDashBoard() {
        return "dashboard";
    }
}
