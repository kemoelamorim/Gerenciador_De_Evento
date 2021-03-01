package br.com.gerenciaEventos.eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gerenciaEventos.eventos.recebeDados.CadastraNovoEvento;


@Controller
@RequestMapping("/")
public class EventoController {
	
	@GetMapping("/")
	public String cadastraEvento() {
		return "index";
	}
	@PostMapping("/cadastraEvento")
	public String home(CadastraNovoEvento requisicao, Model model) {
		String nomeEvento = requisicao.getNome();
		model.addAttribute("nomeEvento", nomeEvento);
		return "home";
	}
}
