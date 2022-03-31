package com.servCrud.service.service;

import com.servCrud.service.entity.Autenticacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.servCrud.service.repo.Autrepo;

import java.util.List;


@Service
public class AutService {

    @Autowired
    private Autrepo autrepo;

    public Autenticacion insertar(Autenticacion aut){
        return autrepo.save(aut);
    }
    public Autenticacion actualizar(Autenticacion aut){
        return autrepo.save(aut);
    }
    public List<Autenticacion> listar(){
        return autrepo.findAll();
    }
    public void eliminar(Autenticacion aut){
        autrepo.delete(aut);
    }
}
