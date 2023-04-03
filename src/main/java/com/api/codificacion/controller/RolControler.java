package com.api.codificacion.controller;

import com.api.codificacion.model.Rol;

import com.api.codificacion.repository.UsuarioRepository;
import com.api.codificacion.service.RolService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RolControler {
    @Autowired
    private final RolService rolService;
    @Autowired
    private final UsuarioRepository usuarioRepository;


    @PostMapping("/rol")
    public Rol save(@RequestBody Rol rol){
        return rolService.save(rol);
    }

    /*
    @PostMapping("/rol")
    public void save(@RequestBody Rol rol){
        Usuario usuario = usuarioRepository.findById(rol.getId()).orElseThrow(() -> new NoSuchElementException("No se encontró el usuario con el ID especificado"));
        rol.setUs(usuario);
        rolService.save(rol);
    }
*/


}



