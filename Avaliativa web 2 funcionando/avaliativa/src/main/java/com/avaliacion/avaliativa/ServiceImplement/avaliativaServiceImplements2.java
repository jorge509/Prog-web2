package com.avaliacion.avaliativa.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacion.avaliativa.model.Autor;
import com.avaliacion.avaliativa.repository.avaliativaRepositorydos;
import com.avaliacion.avaliativa.service.avaliativaServicedos;
@Service
public class avaliativaServiceImplements2 implements avaliativaServicedos {
	@Autowired
	avaliativaRepositorydos repository2;

	@Override
	public Autor save(Autor autor) {
		// TODO Auto-generated method stub
		return repository2.save(autor);
	}

	@Override
	public List<Autor> findAutorByNameLike(String Name) {
		// TODO Auto-generated method stub
		return avaliativaRepositorydos.findAutorByName(Name);
	}

	@Override
	public Autor findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
