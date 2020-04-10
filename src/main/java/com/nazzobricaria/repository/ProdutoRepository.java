package com.nazzobricaria.repository;

import com.nazzobricaria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByUsuarioUsuarioID(int id);
}
