package com.omarsanga.moduloc.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class InteraccionController {
    private final RestTemplate restTemplate;

    public InteraccionController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("")
    public String integrar(){
        String respuestaB = restTemplate.getForObject("http://localhost:8082/consume-a", String.class);
        return "El módulo C recibió: [" + respuestaB + "]";
    }
}
