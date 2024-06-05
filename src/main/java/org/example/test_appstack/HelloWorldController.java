package org.example.test_appstack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloWorldController {

    @GetMapping("/check")
    public String f(){
        return "I'm alive";
    }

    @GetMapping("/")
    public String f2(){
        return "I'm alive";
    }
}
