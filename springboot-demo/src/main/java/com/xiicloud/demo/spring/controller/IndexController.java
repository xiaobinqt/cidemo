package com.xiicloud.demo.spring.controller;

import com.xiicloud.demo.spring.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private Guest guest;

    @GetMapping("/")
    public String index (ModelMap model) {

        model.addAttribute("name" , guest.getName());
        model.addAttribute("sex" , guest.getSex());
        return "index";
    }

}
