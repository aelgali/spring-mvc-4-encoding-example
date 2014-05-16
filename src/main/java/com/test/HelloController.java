package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by AmarE on 5/16/2014.
 */
@Controller
public class HelloController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("helloForm", new HelloForm());
        return "index";
    }

    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String process(HelloForm helloForm) {

        return "processed";
    }
}
