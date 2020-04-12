package com.nazzobricaria;

import com.nazzobricaria.model.Usuario;
import com.nazzobricaria.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.LongStream;

@SpringBootApplication
public class NazzobricariaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NazzobricariaApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepository) {
		return args -> {

			usuarioRepository.deleteAll();
			LongStream.range(1, 4)
					.mapToObj(i -> {
						Usuario usuario = new Usuario();
						usuario.setNome("nome " + i);
						usuario.setSobrenome("sobrenome " + i);
						usuario.setEmail("email@" + i);
						usuario.setCpf("09865434232");
						usuario.setCriadoEm(new Date());
						usuario.setEditadoEm(new Date());
						return usuario;
					})
					.map(usuarioRepository::save)
					.forEach(System.out::println);

		};
	}
}
