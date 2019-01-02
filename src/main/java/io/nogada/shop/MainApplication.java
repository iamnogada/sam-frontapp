package io.nogada.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainApplication
 */
@Controller
public class MainApplication {

    @RequestMapping(value="/")
    public String index(){
        return "/";
    }
}