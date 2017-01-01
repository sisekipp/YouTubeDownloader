package de.sisekipp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by sebastian on 19.11.16.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "main";
    }
}
