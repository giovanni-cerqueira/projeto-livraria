package com.projeto.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.livraria.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
