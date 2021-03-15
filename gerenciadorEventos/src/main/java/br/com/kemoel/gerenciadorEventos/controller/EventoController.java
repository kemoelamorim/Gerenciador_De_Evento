package br.com.kemoel.gerenciadorEventos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.kemoel.gerenciadorEventos.dto.RequisicaoNovoEvento;
import br.com.kemoel.gerenciadorEventos.model.Evento;
import br.com.kemoel.gerenciadorEventos.repository.EventoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@RequestMapping("/")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public ModelAndView listaEventos(Evento evento) {
		ModelAndView mv = new ModelAndView("index");
		List<Evento> eventos = eventoRepository.findAll();
		mv.addObject("eventos",eventos);
		return mv;
	}
	
	@GetMapping("evento/detalhesEvento/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("evento/detalhesEvento");
		Evento evento = eventoRepository.findById(id);
		System.out.println(evento);
		mv.addObject("evento",evento);
		return mv;
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String formEvento(RequisicaoNovoEvento requisicao) {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String postEvento(@Valid RequisicaoNovoEvento requisicao, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("Erro, campos em branco!");
			return "evento/formEvento";
		}
		Evento evento = requisicao.toEvento();
		
		eventoRepository.save(evento);
		return "redirect:/";
	}
	
}
