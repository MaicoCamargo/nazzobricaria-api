package com.nazzobricaria.repository;

import com.nazzobricaria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Produto, Integer> {}
