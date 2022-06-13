package com.avaliacion.avaliativa.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avaliacion.avaliativa.model.Libro;
import com.avaliacion.avaliativa.repository.avaliativaRepository;
import com.avaliacion.avaliativa.repository.avaliativaRepositorydos;
@Controller
public class avaliativaController {

	@Autowired
	avaliativaRepository avaliativaRepository;

	@Autowired
	avaliativaRepositorydos repository2;///declaro repositorio2
	
	@RequestMapping(value="/libro",method=RequestMethod.GET)
	public ModelAndView getLibro() {//cambio libro por libroa
		ModelAndView mv= new ModelAndView("index");
		List<Libro> libro=avaliativaRepository.findAll();
		mv.addObject("libro",libro);
		return mv;
	}
	@RequestMapping(value="/libro/{id}",method=RequestMethod.GET)//cambio libro por libros
	public ModelAndView getLibro(@PathVariable("id")int id) {
		ModelAndView mv= new ModelAndView("libro");
		Optional<Libro> libro=avaliativaRepository.findById(id);
		mv.addObject("libro",libro);
		mv.addObject("autor",libro.get().getAutor());
		mv.addObject("titulo",libro.get().getTitulo());
		mv.addObject("data",libro.get().getData());
		
		mv.addObject("id",libro.get().getId());
		return mv;
		
	}

	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save() {

		return "save";
		
	}
	
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveLibro(@Valid Libro libro ,BindingResult result, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem","verifique os campos obrigatorios");
			return "redirect:/save";
			
		}
		
		
		
		libro.setData(LocalDate.now());
		avaliativaRepository.save(libro);
		attributes.addFlashAttribute("mensagem","Sucess");

		
		
		return "redirect:/libro";
	}
	

	
}
