package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {
	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "TABUADA 1.0";
		tela.largura = 500;
		tela.altura = 700;
		
		tela.criarTela();
		
		
//		Tabuada tabuada = new Tabuada();
//		
//		tabuada.multiplicando = 8;
//		tabuada.minMultiplcador = 4;
//		tabuada.maxMultiplicador = 12;
//		
//		String[] resultado = tabuada.getTabuada();
//		
//		System.out.println(resultado[0]);
//		
//		int i = 0;
//		
//		while(i < resultado.length) {
//			System.out.println(resultado[i]);
//			i++;
//		}
//		
}
}
