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
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    public Usuario save1(Usuario usuario){
        for (Rol rol : usuario.getRol()) {
            Rol rolExistente = rolRepository.findById(rol.getId()).orElseThrow(() -> new NoSuchElementException("No se encontró el usuario con el ID especificado"));
            if (rolExistente != null) {
                rol.setId(rolExistente.getId());
            }
        }
        return usuarioRepository.save(usuario);

    }

    public List<Usuario> finAll(){
    return  usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }



    public void deleteById(Long id){
        usuarioRepository.deleteById(id);
        }



}
