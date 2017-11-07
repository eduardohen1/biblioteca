package br.com.ehSolucoes.bibloteca.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.ehSolucoes.bibloteca.model.Livro;
import br.com.ehSolucoes.bibloteca.repository.Livros;
import br.com.ehSolucoes.bibloteca.repository.filter.LivroFilter;

@Controller
@RequestMapping("/biblioteca")
public class LivrosController {
	
	@Autowired
	private Livros livros;
	
	@GetMapping("/novo")
	public ModelAndView novo(Livro livro){
		ModelAndView modelo = new ModelAndView("biblioteca/cadastro-livro");
		modelo.addObject(livro);
		return modelo;
	}
	
	@PostMapping("/novo")
	public ModelAndView gravar(@Valid Livro livro, BindingResult result,
			RedirectAttributes attributes){
		if(result.hasErrors()){
			return novo(livro);
		}
		livros.save(livro);
		attributes.addFlashAttribute("mensagem","Livro gravado com sucesso!");
		return new ModelAndView("redirect:/biblioteca/novo");
	}
	
	@GetMapping
	public ModelAndView pesquisar(LivroFilter livroFilter){
		ModelAndView modelo = new ModelAndView("biblioteca/pesquisa-livro");
		modelo.addObject("livros",livros.findByNomeContainingIgnoreCase(
				Optional.ofNullable(livroFilter.getNome()).orElse("%")));
		return modelo;
	}
	
	@GetMapping("/{codigo}")
	public ModelAndView editar(@PathVariable Long codigo){
		Livro livro = livros.findOne(codigo);
		return novo(livro);
	}
	
	@DeleteMapping("/{codigo}")
	public String excluir(@PathVariable Long codigo, RedirectAttributes attributes){
		livros.delete(codigo);
		attributes.addFlashAttribute("mensagem","Livro removido com sucesso!");
		return "redirect:/biblioteca";
	}
	
}
