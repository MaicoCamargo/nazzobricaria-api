package com.nazzobricaria.controller;

import com.nazzobricaria.model.Produto;
import com.nazzobricaria.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")

public class ProdutoController {

    ProdutoRepository repository;

    ProdutoController(ProdutoRepository produtoRepository){
        this.repository = produtoRepository;
    }

    @GetMapping
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Produto> getById(@PathVariable int id) {
        return repository.findById(id);
    }

    @GetMapping("/usuario/{id}")
    public List<Produto> getByIdUsuario(@PathVariable int id) {
        return repository.findByUsuarioUsuarioID(id);
    }
}
