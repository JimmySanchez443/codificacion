package com.api.codificacion.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import java.util.Optional;

@Document(collection = "Rol")
@Data
public class Rol implements GrantedAuthority {
    private static final long serialVersionUID = -6520888182897362903L;

    @Id
    private Long idrol;
    private String authority;


    public Rol() {
    }



    public Long getId() {
        return idrol;
    }

    public void setId(Long id) {
        this.idrol = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }



}
