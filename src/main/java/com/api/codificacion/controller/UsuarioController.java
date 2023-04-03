package com.api.codificacion.controller;

import com.api.codificacion.model.Rol;
import com.api.codificacion.model.Usuario;
import com.api.codificacion.repository.RolRepository;
import com.api.codificacion.repository.UsuarioRepository;
import com.api.codificacion.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;
    @Autowired
    private final RolRepository rolRepository;


    @PostMapping("/usuario")
    public void save(@RequestBody Usuario usuario){
        PasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioService.save1(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> findAll(){
    return usuarioService.finAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario findAllId(@PathVariable Long id){
        return usuarioService.findById(id).get();
    }



    @DeleteMapping("/usario/{id}")
    public void deleteById(@PathVariable Long id){
        usuarioService.deleteById(id);
    }

}
