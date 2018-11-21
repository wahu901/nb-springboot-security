/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wayne.Hu
 */

@Controller
public class HelloController {
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    
}
