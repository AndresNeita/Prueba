package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Matriz.SopaLatras;
import com.example.demo.service.SopaletrasService;


@RestController
public class Controller {
	
	@Autowired
	private SopaletrasService sopaletrasService;
	
	


	@GetMapping("/search-horandvert")
	public Map<String , Map<String , Object >> ObtenerResultado(){
		
		
		char[][] SopaLetras = sopaletrasService.CrearMatriz("abcdefghijklmnopqrstuvwxyzabcdef");
		
		SopaLatras.Search(SopaLetras, "tuv");
		
		Boolean respuesta =  SopaLatras.Search(SopaLetras, "tuv");
		
		if (respuesta == true ) {
			
			return  Map.of("sopaletras" , Map.of("Searhword", "abcdefghijklmnopqrstuvwxyzabcdef", "rows" , 4 , "Word" , "tuv" , "contains" , respuesta , "start_row" , SopaLatras.getColumna() , "start_col" , SopaLatras.getColumna()));
			
			
			
		} else {
					
			return  Map.of("sopaletras" , Map.of("Searhword", "abcdefghijklmnopqrstuvwxyzabcdef", "rows" , 4 , "Word" , "cool" , "contains" , respuesta));

		}
		
		
	}
	
	@GetMapping("/search")
	public Map<String , Map<String , Object >> BuscarDiagonal(){
		
		
		char[][] SopaLetras = sopaletrasService.CrearMatriz("abcdefghijklmnopqrstuvwxyzabcdef");
		
		Boolean respuesta = sopaletrasService.BuscarDiagonal(SopaLetras, "los");
		
		if (respuesta == true) {
			
			return  Map.of("sopaletras" , Map.of("Searhword", "abcdefghijklmnopqrstuvwxyzabcdef", "rows" , 4 , "Word" , "tuv" , "contains" , respuesta));
		}
		
		else {
			
			return  Map.of("sopaletras" , Map.of("Searhword", "abcdefghijklmnopqrstuvwxyzabcdef", "rows" , 4 , "Word" , "cool" , "contains" , respuesta));
			
		}
		


	}
	


}
