package com.nazzobricaria.controller;

import com.nazzobricaria.model.Usuario;
import com.nazzobricaria.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioRepository repository;

    UsuarioController(UsuarioRepository usuarioRepository) {
        this.repository = usuarioRepository;
    }

    @GetMapping
    public Usuario findAll(){
        System.out.println(repository.findByEmail("email@1"));
        return repository.findByEmail("email@1");
    }

    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable int id){
        return repository.findById(id);
    }
}