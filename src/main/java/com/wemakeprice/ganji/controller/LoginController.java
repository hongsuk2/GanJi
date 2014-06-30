package com.wemakeprice.ganji.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String home() {
        
        return "/login/login";
    }
    
    @RequestMapping(value = "/login/loginAction")
    public String loginAction(HttpSession session) {
        session.setAttribute("login", "tina");
        System.out.println(session.getAttribute("login"));
        return "redirect:/main";
    }
    
    @RequestMapping(value = "/login/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("login");
        return "redirect:/login";
    }
}
