package pl.sda.spring.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

    @GetMapping("/developers")
    public String developers() {
        return "Welcome to the page for developers only!";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Welcome to the page for managers only!";
    }

    @GetMapping("/sales")
    public String sales() {
        return "Welcome to the page for sales only!";
    }
}
