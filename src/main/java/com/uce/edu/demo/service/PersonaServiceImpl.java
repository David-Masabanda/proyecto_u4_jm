package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	@Override
	public void guardar(Persona p) {
		this.personaRepository.insertar(p);
	}

	@Override
	public void actualizar(Persona p) {
		this.personaRepository.actualizar(p);
	}

	@Override
	public void eliminar(Integer id) {
		this.personaRepository.eliminar(id);
	}

	@Override
	public Persona buscarPorId(Integer id) {
		return this.personaRepository.buscarPorId(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		return this.personaRepository.buscarTodos();
	}


}
