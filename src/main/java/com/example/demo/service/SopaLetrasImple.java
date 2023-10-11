package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SopaLetrasImple implements SopaletrasService {

	@Override
	public char[][] CrearMatriz(String palabra) {

		int contador = 0;

		char[][] SopaLetras = new char[4][8];

		// palabra a encontrar gato y perro

		for (int i = 0; i < 4; i++) {// Ciclo for para rellenar la matriz

			for (int j = 0; j < 8; j++) {

				SopaLetras[i][j] = palabra.charAt(contador);

				contador++;
			}
		}

		return SopaLetras;
	}


	@Override
	public boolean BuscarDiagonal(char[][] Matrix, String palabra) {

		//mostrando diagonal
        System.out.println("Los elementos de la digonal son:");
        
        char letra1 ;
        
        String PalabraCompleta = "";
        
        boolean respuesta = false;

		int contador = 0;
        
        for (int i = 0; i < 4; i++) {// Ciclo for para rellenar la matriz

			for (int j = 0; j < 8; j++) {

				 if(i == j){
					 
					 letra1 = Matrix[i][j]; 
					 
					 PalabraCompleta = PalabraCompleta + letra1;
					 
					 if (PalabraCompleta.contains(palabra)) {
						 
						 respuesta = true;
						 System.out.println(Matrix[i][j]);
						 
						 
					 }
					 
					 else {
						 
						 respuesta = false ;
						 
					 }
					 
	                
				 }

				contador++;
			}
		}

		return respuesta;

	}
}
