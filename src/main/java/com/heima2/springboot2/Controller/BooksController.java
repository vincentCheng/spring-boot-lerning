package com.heima2.springboot2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/books")
@RestController
public class BooksController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private Environment environment;

    @GetMapping("/{id}")
    public String get(@PathVariable Integer id) {
        System.out.println("id: " + id);
        System.out.println("name: " + environment.getProperty("local-user.name"));
        System.out.println("port: " + port);
        return "hello world";
    }
}
