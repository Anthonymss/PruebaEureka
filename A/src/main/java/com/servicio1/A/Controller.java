package com.servicio1.A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Controller
{
    @Autowired
    private RestTemplate restTemplate;

    private List<Producto> lista=List.of(
            new Producto("Auto",1,"aU"),
            new Producto("Auto",1,"aU"),
            new Producto("Auto",1,"aU"),
            new Producto("Auto",1,"aU")
    );
    @GetMapping("/servicio")
    @ResponseStatus(HttpStatus.OK)
    public String getServicio(){
        return "A"+lista.toString();
    }
    @GetMapping("/servicio/{valor}")
    public String getServicixo(@PathVariable String valor) {
        String url = "http://" + valor + "/api/servicio";
        System.out.println("A::Llamando al servicio: " + url);
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return "Servicio A recibió respuesta: " + response.getBody();
        } catch (Exception e) {
            return "Error al intentar conectar con el servicio: " + valor + ". " + e.getMessage();
        }
    }
}
