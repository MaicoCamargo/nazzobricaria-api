package com.nazzobricaria;

import com.nazzobricaria.model.Status;
import com.nazzobricaria.model.Usuario;
import com.nazzobricaria.repository.StatusRepository;
import com.nazzobricaria.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class NazzobricariaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NazzobricariaApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StatusRepository repository, UsuarioRepository usuarioRepository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
					.mapToObj(i -> {
						Status c = new Status();
						c.setStatus("Status " + i);
						return c;
					})
					.map(repository::save)
					.forEach(System.out::println);

			usuarioRepository.deleteAll();
			LongStream.range(1, 4)
					.mapToObj(i -> {
						Usuario usuario = new Usuario();
						usuario.setNome("nome " + i);
						usuario.setSobrenome("nome " + i);
						return usuario;
					})
					.map(usuarioRepository::save)
					.forEach(System.out::println);

		};
	}
}
