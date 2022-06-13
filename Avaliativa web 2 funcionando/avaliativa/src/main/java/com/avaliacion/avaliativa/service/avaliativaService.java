package com.avaliacion.avaliativa.service;

import java.util.List;

import com.avaliacion.avaliativa.model.Libro;

public interface avaliativaService {
List<Libro> findAll();
Libro findById(Integer id);
Libro save(Libro libro);
}
  