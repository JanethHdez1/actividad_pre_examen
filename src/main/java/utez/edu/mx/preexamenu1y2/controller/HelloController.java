package utez.edu.mx.preexamenu1y2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String sayHello() {
        return "Hola mundo";
    }
}
