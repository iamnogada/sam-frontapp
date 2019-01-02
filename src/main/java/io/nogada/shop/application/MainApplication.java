package io.nogada.shop.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainApplication
 */
@Controller
public class MainApplication {

    @GetMapping("/")
    public String index(){
        return "redirect:/index.html";
    }    
}