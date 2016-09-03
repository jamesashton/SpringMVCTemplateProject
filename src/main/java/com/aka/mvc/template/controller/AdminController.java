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

/**
 * Created by james on 28/08/2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = {"/","/home"}, method= RequestMethod.GET)
    public String home(ModelMap model) {
        String title = "Admin homepage";
        model.addAttribute("title",title);
        model.addAttribute("user",getPrincipal());
        return "admin/home";
    }

    @RequestMapping("/user")
    public String userAdmin(ModelMap model) {
        String title = "User Admin";
        model.addAttribute("title",title);
        model.addAttribute("user",getPrincipal());
        return "admin/user";
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
