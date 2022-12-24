package com.springbook.springboot.web;

import com.springbook.springboot.web.dto.HelloReesponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloReesponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloReesponseDto(name, amount);
    }
}
