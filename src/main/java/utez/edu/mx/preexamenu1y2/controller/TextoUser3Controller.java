package utez.edu.mx.preexamenu1y2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/textoUser3")
public class TextoUser3Controller {
    @GetMapping("")
    public String sayHello() {
        return "Texto de User 3";
    }
}
