package de.sisekipp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sebastian on 19.11.16.
 */
@Controller
public class SearchController {

    @GetMapping(path = "/search")
    public String search(@RequestParam("url") String url, Model model) {
        return "redirect:/";
    }
}
