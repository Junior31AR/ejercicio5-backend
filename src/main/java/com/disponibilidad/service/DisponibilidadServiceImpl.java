package com.disponibilidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disponibilidad.entity.Disponibilidad;
import com.disponibilidad.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository repo;
	
	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public List<Disponibilidad> listaDisponibilidades() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
