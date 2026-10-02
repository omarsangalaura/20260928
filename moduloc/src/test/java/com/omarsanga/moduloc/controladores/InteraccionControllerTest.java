package com.omarsanga.moduloc.controladores;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = InteraccionController.class)
public class InteraccionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void probandoComunicacionModuloC() throws Exception{
        mockMvc.perform(get("/cintegracion"))
                .andExpect(status().isOk())
                .andExpect(content().string("El módulo C recibió: [El módulo B recibió: [Hola desde el Módulo A]]"));
    }
}
