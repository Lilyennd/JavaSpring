package cl.bancoxyz.transferencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaController {
    @GetMapping("/hola")
    public String hola() {
        return "Hola, mundo!";
    }

        @GetMapping("/chao")
    public String chao() {
        return "Chao, mundo!";
    }




}
