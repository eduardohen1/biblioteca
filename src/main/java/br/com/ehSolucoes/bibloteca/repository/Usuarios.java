package br.com.ehSolucoes.bibloteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ehSolucoes.bibloteca.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario,String> {

}
