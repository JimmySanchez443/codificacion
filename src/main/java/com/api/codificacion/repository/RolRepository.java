package com.api.codificacion.repository;

import com.api.codificacion.model.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends MongoRepository<Rol,Long> {

}
