package com.servCrud.service.controller;

import com.servCrud.service.entity.Autenticacion;
import com.servCrud.service.service.AutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autenticacion")
public class Autcontro {
    @Autowired
    private AutService autservice;
    @GetMapping
    public List<Autenticacion> listar(){
        return  autservice.listar();
    }
    @PostMapping
    public Autenticacion insertar(@RequestBody Autenticacion aut){
        return autservice.insertar(aut);
    }
    @PutMapping
    public Autenticacion actualizar(@RequestBody Autenticacion aut){
        return autservice.actualizar(aut);
    }
    @DeleteMapping
    public void eliminar (@RequestBody Autenticacion aut){
        autservice.eliminar(aut);
    }
}
