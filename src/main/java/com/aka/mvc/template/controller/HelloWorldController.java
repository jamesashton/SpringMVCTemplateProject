package com.aka.mvc.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by james on 28/08/2016.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "<h3>HELLO WORLD!!!!!</h3>";
        return new ModelAndView("welcome","message", message);
    }

    @RequestMapping("/hello")
    public ModelAndView helloWorld2() {
        String message = "<h4>HOWDY WORLD!!!!!</h4>";
        return new ModelAndView("welcome","message", message);
    }


}
