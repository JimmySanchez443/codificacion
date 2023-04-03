package com.api.codificacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CodificacionApplication {

	public static void main(String[] args) {
		PasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
		System.out.println("aqui empieza");
		System.out.println(passwordEncoder.encode("1724"));
		System.out.println("aqui termina");
		SpringApplication.run(CodificacionApplication.class, args);
	}


}
