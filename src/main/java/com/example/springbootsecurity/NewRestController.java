/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootsecurity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wayne.Hu
 */
@RestController
@RequestMapping("/url")
public class NewRestController {
    
   
    
    
    @RequestMapping (value="/hello")
    public String sayHello() {
        return "Hello";
    }
}
