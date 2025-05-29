package utez.edu.mx.preexamenu1y2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/textoUser2")
public class TextoUser2Controller {
    @GetMapping("")
    public String sayHello() {
        return "Cambio definitivo de texto en la rama textoUser2";
    }
}
