package br.senai.sp.jandira.model;

public class Tabuada {
	
	//Atributos
	public int multiplicando;
	public int minMultiplcador;
	public int maxMultiplicador;
	
	//Métodos
	public String[] getTabuada() {
		
		minMultiplcador = 2;
		maxMultiplicador = 7;
		multiplicando = 10;
		
		int tamanho = maxMultiplicador - minMultiplcador + 1;
		String[] tabuada = new String[tamanho];
		
		int i;
		i = 0;
		while(minMultiplcador <= maxMultiplicador) {
			
			int produto = multiplicando * minMultiplcador;
			
			//2 x 4 = 8
			String resultado = multiplicando + " X " + minMultiplcador + " = " + produto; 
			tabuada[i] = resultado;
			
			i++;
			minMultiplcador++;
		}
		
		return tabuada;
		
//		int i ;
//		i = minMultiplcador;
//		while( i <= maxMultiplicador ) {
//			
//			if( i > maxMultiplicador) {
//				
//				i++;
//				return;
//			}
//			
//			
//		}
		
//		
//		while(i <= maxMultiplicador){
//			
//			System.out.printf("%s X %s = %s", multiplicando, i, multiplicando*i);
//			
//			i++;
//		}
		
	}
	
}
