package br.com.gerenciaEventos.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gerenciaEventos.eventos.entidades.Pessoa;
import br.com.gerenciaEventos.eventos.repository.PessoaRepository;

@Controller
@RequestMapping("/pessoas/")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("showForm")
	public String showPessoaForm() {
		return "add-pessoa";
	}
	
	@GetMapping("list")
	public String pessoas(Model model) {
		model.addAttribute("pessoas", this.pessoaRepository.findAll());
		return "home";
	}
	
	@PostMapping("add")
	public String addPessoa(@Validated Pessoa pessoa, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add-pessoa";
		}
		this.pessoaRepository.save(pessoa);
		return "redirect:list";
	}
	
}
