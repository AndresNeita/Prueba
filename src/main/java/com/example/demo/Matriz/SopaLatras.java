package com.example.demo.Matriz;

public class SopaLatras {
	
	public String letras;
	
	public String palabra;
	
	public static int columna;
	
	public static int fila;


	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	 public static int getColumna() {
		return columna;
	}

	public static void setColumna(int columna) {
		SopaLatras.columna = columna;
	}

	public static int getFila() {
		return fila;
	}

	public static void setFila(int fila) {
		SopaLatras.fila = fila;
	}

	public static boolean Search(char[][] Matrix, String word) {

	        if (BusquedaHorizontal(Matrix, word) == true) {

	            return true;

	        } else {

	            
	            if (BusquedaVertical(Matrix, word) == true) {

	                return true;

	            } else {

	                return false;
	            }

	        }

	    }

	    public static boolean BusquedaHorizontal(char[][] Matrix, String word) {
	    	
	    	System.out.println("metodo horizontal");
	    	System.out.println("");
	    	
	    	//abcd efgh ijkl mnop qrstuvwx yzabcdef

	        String Palabra = "";

	        char letra1;

	        boolean Encotrada = false;

	        for (int i = 0; i < Matrix.length; i++) {//Ciclo for para mostrar la matriz

	            for (int j = 0; j < Matrix[i].length; j++) {

	                System.out.print(Matrix[i][j] + " ");

	                letra1 = Matrix[i][j];

	                Palabra = Palabra + letra1;
	                
	               

	                if (Palabra.contains(word)) {
	                	
	                	setFila(j);
	                	
	                	setColumna(i);

	                    Encotrada = true;

	                } else {

	                    Encotrada = false;

	            
	                }

	            }

	            System.out.println(Palabra);
	            
	        }

	        return Encotrada;
	    }

	    public static boolean BusquedaVertical(char[][] Matrix, String word) {
	    	
	    	System.out.println("");
	    	System.out.println("metodo vertical");
	    	

	        String Palabra = "";

	        char letra1;

	        boolean Encotrada = false;

	        for (int i = 0; i < 8; i++) {//Ciclo for para mostrar la matriz

	            for (int j = 0; j < 4; j++) {

	                System.out.print(Matrix[j][i] + " ");

	                letra1 = Matrix[j][i];

	                Palabra = Palabra + letra1;

	                if (Palabra.contains(word)) {

	                    Encotrada = true;

	                } else {

	                    Encotrada = false;

	                   
	                }

	            }

	            System.out.println(Palabra);
	        }

	        return Encotrada;

	    }
	
	    

		 public  boolean SearchDiagonal(char[][] Matrix, String word) {

			 	System.out.println("");
		    	System.out.println("metodo vertical");
		    	

		        String Palabra = "";

		        char letra1;

		        boolean Encotrada = false;

		        for (int i = 0; i < 8; i++) {//Ciclo for para mostrar la matriz

		            for (int j = 0; j < 4; j++) {

		                System.out.print(Matrix[j][i] + " ");

		                letra1 = Matrix[j][i];

		                Palabra = Palabra + letra1;

		                if (Palabra.contains(word)) {

		                    Encotrada = true;

		                } else {

		                    Encotrada = false;

		                   
		                }

		            }

		            System.out.println(Palabra);
		        }

		        return Encotrada;
			 
			 
		 }
		 
		 
		 
	

}
