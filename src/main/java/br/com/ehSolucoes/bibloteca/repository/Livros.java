package br.com.ehSolucoes.bibloteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ehSolucoes.bibloteca.model.Livro;

public interface Livros extends JpaRepository<Livro, Long> {
	public List<Livro> findByNomeContainingIgnoreCase(String nome);
}
