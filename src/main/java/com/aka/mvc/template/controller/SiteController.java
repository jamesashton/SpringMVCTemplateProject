package com.aka.mvc.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by james on 28/08/2016.
 */
@Controller
public class SiteController {

    @RequestMapping("/index")
    public ModelAndView home() {
        String message = "<h3>Homepage</h3>";
        return new ModelAndView("index","message", message);
    }

    @RequestMapping("/about")
    public ModelAndView about() {
        String message = "<h4>About Us</h4>";
        return new ModelAndView("about","message", message);
    }

}
