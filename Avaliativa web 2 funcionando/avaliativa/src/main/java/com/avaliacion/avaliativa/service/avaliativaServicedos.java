package com.avaliacion.avaliativa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.avaliacion.avaliativa.model.Autor;
import com.avaliacion.avaliativa.model.Libro;
@Service
public interface avaliativaServicedos {
	Autor save(Autor autor);
	Autor findById(Integer id);
	List<Autor> findAutorByNameLike(String Name);
}


