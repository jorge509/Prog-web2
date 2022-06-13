package com.avaliacion.avaliativa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacion.avaliativa.model.Autor;

@Repository
public interface avaliativaRepositorydos extends JpaRepository<Autor, Integer> { 
	
	
	
	
	
	
	static List<Autor> findAutorByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	Optional<Autor> findById(Integer Id);        
}



