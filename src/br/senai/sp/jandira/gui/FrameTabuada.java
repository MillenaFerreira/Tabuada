package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Tabuada;


public class FrameTabuada {
	
		// atributos
		public String titulo;
		public int largura;
		public int altura;
		
		public Color corDoTitulo = new Color(255, 40, 40);
		public Color corDoSubtitulo = new Color(205, 207, 207);
		public Color corDoTexto = new Color (0, 0, 0);
		public Color corDoButtonCalcular = new Color (66, 189, 109);
		public Color corDaLista = new Color (254, 240, 186);
		public Color corDoButtonLimpar = new Color (251, 202, 9);
		
		// metodos
		public void criarTela() {
			
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		// definir meu layout
		tela.setLayout(null);
		Container painel = tela.getContentPane();
		painel.setBackground(null);
		
		Container painel1 = tela.getContentPane();
		painel1.setBackground(null);
		
		
		//titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 40));
		labelTitulo.setBackground(corDoTitulo);
		labelTitulo.setBounds(70, 20, 300, 40);
		

		
		//imagem
		JLabel labelimagem = new JLabel();
		ImageIcon icone2 = new ImageIcon("src/br/senai/sp/jandira/imagens/duvida.png");
		labelimagem.setIcon(icone2);
		labelimagem.setBounds(5, 20, 100, 70);
		
//		//icone de cima mudado
//		tela.setIconImages(new ImageIcon("src/br/senai/sp/jandira/imagens/duvida.png"));
		
		//Subtitulo
		JLabel labelsubtitulo = new JLabel();
		
		String subtitulo ="<html>Com a tabuada 1.0 os seus problemas acabaram."+
		" Calcule <br> a tabuada que desejar em segundos!</html>";
		
		labelsubtitulo.setText(subtitulo);
		
		labelsubtitulo.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		labelsubtitulo.setBackground(corDoSubtitulo);	
		labelsubtitulo.setBounds(70, 55, 500, 40);
		
		
		
		
		//Textos
		
		//Multiplicando
		JLabel labelTextoMultiplicando = new JLabel();
		labelTextoMultiplicando.setText("Multiplicando: ");
		labelTextoMultiplicando.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		labelTextoMultiplicando.setBackground(corDoTexto);
		labelTextoMultiplicando.setBounds(150, 120, 200, 40);
		
		JTextField textFieldTextoMultiplicando = new JTextField();
		textFieldTextoMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		textFieldTextoMultiplicando.setBounds(310, 125, 150, 30);
		
		
		//Minimo Multiplicador
		JLabel labelTextoMinimoMultiplicador = new JLabel();
		labelTextoMinimoMultiplicador.setText("Mínimo Multiplicador: ");
		labelTextoMinimoMultiplicador.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		labelTextoMinimoMultiplicador.setBackground(corDoTexto);
		labelTextoMinimoMultiplicador.setBounds(70, 180, 300, 40);
		
		JTextField textFieldTextoMinimoMultiplicador = new JTextField();
		textFieldTextoMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
//		textFieldTextoMinimoMultiplicador.setBackground(Color.CYAN);
		textFieldTextoMinimoMultiplicador.setBounds(310, 185, 150, 30);
		
		
		
		//Maximo Multiplicador
		JLabel labelTextoMaximoMultiplicador = new JLabel();
		labelTextoMaximoMultiplicador.setText("Máximo Multiplicador: ");
		labelTextoMaximoMultiplicador.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		labelTextoMaximoMultiplicador.setBackground(corDoTexto);
		labelTextoMaximoMultiplicador.setBounds(65, 240, 300, 40);
		
		JTextField textFieldTextoMaximoMultiplicador = new JTextField();
		textFieldTextoMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldTextoMaximoMultiplicador.setBounds(310, 245, 150, 30);
		
		
		//botões
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(corDoButtonCalcular);
		buttonCalcular.setBounds(50, 300, 250, 50);
		
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBackground(corDoButtonLimpar);
		buttonLimpar.setBounds(310, 300, 150, 50);
		
		
		//resultados
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");
		labelResultado.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		labelResultado.setBackground(corDoButtonCalcular);
		labelResultado.setBounds(50, 380, 150, 30);
		
		JList<String> lista = new JList<>();
		lista.setBackground(corDaLista);
		lista.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		lista.setBorder(new LineBorder(Color.BLACK));
		
		
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setBounds(50, 410, 410, 240);
		
		//fazendo o botão calcular funcionar
		
		buttonCalcular.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//mensagens de erro dentro do button calcular, usado para quando aperta o button e tiver algum erro.
				if(textFieldTextoMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O multiplicado é necessário!");
					textFieldTextoMultiplicando.requestFocus();
				}else if(textFieldTextoMinimoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Mínimo Multiplicador é necessário!");
					textFieldTextoMinimoMultiplicador.requestFocus();
				}else if(textFieldTextoMaximoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Máximo Multiplicador é necessário!");
					textFieldTextoMaximoMultiplicador.requestFocus();
				}else {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(textFieldTextoMultiplicando.getText());
					tabuada.minMultiplcador = Integer.parseInt(textFieldTextoMinimoMultiplicador.getText());
					tabuada.maxMultiplicador = Integer.parseInt(textFieldTextoMaximoMultiplicador.getText());
				if(tabuada.minMultiplcador > tabuada.maxMultiplicador) {
						JOptionPane.showMessageDialog(null, "Máximo multiplicador é maior que o Mínimo multiplicador");
				}else {
					
					lista.setListData(tabuada.getTabuada());
				}
					
				}
				
			}
		});
		

		buttonLimpar.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textFieldTextoMultiplicando.setText("");
				textFieldTextoMinimoMultiplicador.setText("");
				textFieldTextoMaximoMultiplicador.setText("");
				
				DefaultListModel<String> listalimpar = new DefaultListModel<>();
				lista.setModel(listalimpar);
			}
		});
		
		
		
		
		
		
		// adicionar os componentes ao painel
		painel.add(labelTitulo);
		painel.add(labelsubtitulo);
		painel.add(labelTextoMultiplicando);
		painel.add(labelTextoMinimoMultiplicador);
		painel.add(labelTextoMaximoMultiplicador);
		painel.add(textFieldTextoMultiplicando);
		painel.add(textFieldTextoMinimoMultiplicador);
		painel.add(textFieldTextoMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		//painel.add(Lista);
		painel.add(labelimagem);
		
		
		// Tornar a janela visível
		tela.setVisible(true);
		
		
		}
}
