package com.avaliacion.avaliativa.repository;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacion.avaliativa.model.Libro;
@Repository
public interface avaliativaRepository extends JpaRepository<Libro, Integer> {
	 
	List<Libro> findLibrosByTipo(int tipo);

	 List<Libro> findLibrosByTituloLike(String titulo);


	   
	  
        
}
