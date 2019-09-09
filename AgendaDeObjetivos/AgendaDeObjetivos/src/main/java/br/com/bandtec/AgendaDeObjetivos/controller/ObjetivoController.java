package br.com.bandtec.AgendaDeObjetivos.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivoController {

	private TodosObjetivos todosObj;
	@Autowired
	public ObjetivoController(TodosObjetivos to){
		this.todosObj=to;
	}
	
	@PostMapping("/objetivos")
	public ResponseEntity<Objetivo> cadastrarObjetivo(@RequestBody Objetivo nObjetivo) {
	
		todosObj.save(nObjetivo);
		return ResponseEntity.ok(nObjetivo);
	}
	
	@GetMapping("/objetivos/data/{data}")
	public ResponseEntity<List<Objetivo>> obterPorObetivo(@PathVariable("data") String porData){
			LocalDate data = LocalDate.parse(porData);
			List<Objetivo> objetivos = todosObj.ate(data);
			if (objetivos.isEmpty()) {
				
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(objetivos);
			
		}
}
 