package com.api.codificacion.service;

import com.api.codificacion.model.Usuario;
import com.api.codificacion.repository.UsuarioRepository;
import com.api.codificacion.security.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private CustomPasswordEncoder passwordEncoder;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> userOpt = usuarioRepository.findByUsername(username);
        return userOpt.orElseThrow(()-> new UsernameNotFoundException("Credenciales Invalidas"));

    }
}
