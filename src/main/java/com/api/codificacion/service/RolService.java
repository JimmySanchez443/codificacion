package com.api.codificacion.service;

import com.api.codificacion.model.Rol;
import com.api.codificacion.model.Usuario;
import com.api.codificacion.repository.RolRepository;
import com.api.codificacion.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolService {
    @Autowired
    private final RolRepository rolRepository;
    @Autowired
    private final UsuarioRepository usuarioRepository;




    public Rol save(Rol rol){
        rolRepository.save(rol);
        return rol;
    }

    public List<Rol> finAll(){
        return  rolRepository.findAll();
    }

    public Optional<Rol> findById(Long id) {
        return rolRepository.findById(id);
    }


    public void deleteById(Long id){
        rolRepository.deleteById(id);
    }


}
