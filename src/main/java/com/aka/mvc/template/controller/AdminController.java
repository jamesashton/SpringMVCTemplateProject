package com.aka.mvc.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by james on 28/08/2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/home")
    public ModelAndView home() {
        String message = "<h3>Admin homepage</h3>";
        return new ModelAndView("admin/home","message", message);
    }

    @RequestMapping("/user")
    public ModelAndView helloWorld2() {
        String message = "<h4>User Admin</h4>";
        return new ModelAndView("/admin/user","message", message);
    }


}
