package br.com.ehSolucoes.bibloteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivros;
	
	@NotBlank
	@Length(min=1, max=100)
	private String nome;
	
	@NotBlank
	@Length(min=1, max=200)
	private String autor;
	
	@NotBlank
	@Length(min=1, max=100)
	private String isbn;

	public Long getIdLivros() {
		return idLivros;
	}

	public void setIdLivros(Long idLivros) {
		this.idLivros = idLivros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLivros == null) ? 0 : idLivros.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (idLivros == null) {
			if (other.idLivros != null)
				return false;
		} else if (!idLivros.equals(other.idLivros))
			return false;
		return true;
	}
	
	
	
	
}
