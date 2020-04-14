package com.nazzobricaria;

import com.nazzobricaria.model.Permissao;
import com.nazzobricaria.model.Usuario;
import com.nazzobricaria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class NazzobricariaApiApplication {

	// https://dzone.com/articles/spring-boot-security-json-web-tokenjwt-hello-world
	// https://memorynotfound.com/spring-boot-spring-security-hibernate-configuration-example/
	public static void main(String[] args) {
		SpringApplication.run(NazzobricariaApiApplication.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioRepository userRepository;

	@PostConstruct
	public void init(){

		Usuario usuario = new Usuario();
		usuario.setNome("nome_init ");
		usuario.setSobrenome("sobrenome_init ");
		usuario.setEmail("email@_init");
		usuario.setCpf("09865434232");
		usuario.setPassword(passwordEncoder.encode("1234"));
		usuario.setCriadoEm(new Date());
		usuario.setEditadoEm(new Date());
//		usuario.setPermissoes(Arrays.asList(
//				new Permissao("ROLE_USER"),
//				new Permissao("ROLE_ADMIN")));

		if (userRepository.findByEmail(usuario.getEmail()) == null){
			userRepository.save(usuario);
		}
	}
}
