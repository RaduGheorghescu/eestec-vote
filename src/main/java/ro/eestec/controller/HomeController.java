package ro.eestec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by radug on 6/9/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "redirect:/sedinte";
    }
}
