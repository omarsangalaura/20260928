package com.omarsanga.moduloa.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public String saludar(){
        return "Hola desde el Módulo A";
    }
}
