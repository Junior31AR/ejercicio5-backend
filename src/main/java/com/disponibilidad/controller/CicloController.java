package com.disponibilidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.disponibilidad.entity.Ciclo;
import com.disponibilidad.service.CicloService;

@RestController
@RequestMapping("/rest/utils")
@CrossOrigin(origins = "http://localhost:4200")
public class CicloController {

	@Autowired
	private CicloService cicloService;
	
	@GetMapping("/ciclo")
	@ResponseBody
	public ResponseEntity<List<Ciclo>>listaCiclos(){
		List<Ciclo>lista = cicloService.listaCiclos();
		return ResponseEntity.ok(lista);
	}
	
}
