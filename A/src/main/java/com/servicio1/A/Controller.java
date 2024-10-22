package com.servicio1.A;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Controller
{
    @GetMapping("/servicio")
    @ResponseStatus(HttpStatus.OK)
    public String getServicio(){
        return "Servicio A";
    }
}
