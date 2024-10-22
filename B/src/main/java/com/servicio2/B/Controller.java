package com.servicio2.B;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Controller
{
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/servicio")
    @ResponseStatus(HttpStatus.OK)
    public String getServicio(){
        return "Servicio B";
    }
    @GetMapping("/servicio/{valor}")
    public String getServicixo(@PathVariable String valor) {
        String url = "http://" + valor + "/api/servicio";
        System.out.println("B::Llamando al servicio: " + url);
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return "Servicio B  so B recibió respuesta: " + response.getBody();
        } catch (Exception e) {
            return "Error al intentar conectar con el servicio: " + valor + ". " + e.getMessage();
        }
    }
}
