package com.api.codificacion.repository;

import com.api.codificacion.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
