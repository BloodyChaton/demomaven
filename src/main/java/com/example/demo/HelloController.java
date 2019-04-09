package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Luc tu es tellement beau si je n'étais pas un ordinateur je te ferais la cour!";
    }

}
