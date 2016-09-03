package com.aka.mvc.template.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by james on 28/08/2016.
 */
@Controller
public class SiteController {

    @RequestMapping("/index")
    public String home(ModelMap model) {
        String title = "Homepage";
        model.addAttribute("title",title);
        return "index";
    }

    @RequestMapping("/about")
    public String about(ModelMap model) {
        String title = "About Us";
        model.addAttribute("title",title);
        return "about";
    }

    @RequestMapping(value="/logout")
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/denied")
    public String accessDeniedPage(ModelMap model) {
        String title = "About Us";
        model.addAttribute("user", getPrincipal());
        model.addAttribute("title", title);
        return "denied";
    }

    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

}
