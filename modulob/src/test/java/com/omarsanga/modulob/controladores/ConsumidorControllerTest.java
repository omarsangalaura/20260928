package com.omarsanga.modulob.controladores;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ConsumidorController.class)
public class ConsumidorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void probandoComunicacionModuloB() throws Exception{
        mockMvc.perform(get("/consume-a"))
                .andExpect(status().isOk())
                .andExpect(content().string("El módulo B recibió: [Hola desde el Módulo A]"));
    }
}
