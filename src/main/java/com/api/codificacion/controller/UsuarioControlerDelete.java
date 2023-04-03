package com.api.codificacion.controller;


import com.api.codificacion.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsuarioControlerDelete {

    @Autowired
    private final UsuarioService usuarioService;

    @RequestMapping(value="/api/v1/delete/usuario/{id}", method= RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        usuarioService.deleteById(id);
    }

}
