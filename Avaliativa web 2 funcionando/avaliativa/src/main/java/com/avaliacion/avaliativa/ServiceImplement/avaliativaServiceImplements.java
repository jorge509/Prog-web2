package com.avaliacion.avaliativa.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacion.avaliativa.model.Libro;
import com.avaliacion.avaliativa.repository.avaliativaRepository;

import com.avaliacion.avaliativa.service.avaliativaService;

@Service
public class avaliativaServiceImplements implements avaliativaService {

@Autowired
avaliativaRepository avaliativaRepository;

@Override
public List<Libro> findAll() {
	// TODO Auto-generated method stub
	return avaliativaRepository.findAll();
}

@Override
public Libro findById(Integer id) {
	// TODO Auto-generated method stub
	return avaliativaRepository.findById(id).get();
}


@Override
public Libro save(Libro libro) {
	// TODO Auto-generated method stub
	return avaliativaRepository.save(libro);
}




}










