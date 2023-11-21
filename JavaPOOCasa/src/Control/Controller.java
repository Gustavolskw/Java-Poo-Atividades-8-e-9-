package Control;
import View.EntradaSaida;
import javax.swing.JOptionPane;
import Model.*;

import java.util.ArrayList;

public class Controller {
	 private Casa casa = null;
	  public void showMenu(){
		   int opcao;
		   
		   do{
				opcao = EntradaSaida.solicitaOpcao();
				switch (opcao){
					 
					 case 0 :
						  JOptionPane.showMessageDialog(null, "Construir Casa" );
						  this.casa = new Casa();
						  String descricao = EntradaSaida.solicitaDescricao("casa",0);
								  String cor = EntradaSaida.solicitaCor();
								  int quantidadeDejanelas = EntradaSaida.solicitaQntdAberturas("janelas");
								  int quantidadeDePortas = EntradaSaida.solicitaQntdAberturas("portas");
						  
						  ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
						  for (int i = 0; i < quantidadeDePortas; i ++){
							 Portas portas = new Portas();
							 portas.setDescricao(EntradaSaida.solicitaDescricao("porta ",(i+1)));
							 portas.setEstado(EntradaSaida.solicitaEstado("Porta"));
							 listaDePortas.add(portas);
							 
						  }
						  ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
						  for (int i = 0; i<quantidadeDejanelas; i ++){
							   Janela janelas = new Janela();
							   janelas.setDescricao(EntradaSaida.solicitaDescricao("Janela", (i+1)));
							   janelas.setEstado(EntradaSaida.solicitaEstado("Janela"));
							   listaDeJanelas.add(janelas);
						  }
						  this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
						  System.out.println("Descrição da Casa "+ casa.getDescricao()+"\n");
						  System.out.println("Cor Da Casa "+ casa.getCor()+"\n");
						  for (Aberturas porta : casa.getListaDejanelas()){
							   System.out.println("Descriçao da Porta "+ porta.getDescricao()+"\n");
							   System.out.println("Estado da Porta "+ porta.getEstado()+"\n");
							   
						  }
						  for(Aberturas janela : casa.getListaDejanelas()){
							   System.out.println("Descriçao da Janela "+ janela.getDescricao()+"\n");
							   System.out.println("estado da janela "+ janela.getEstado()+"\n");
						  }
						  break;
					 case 1:
						  JOptionPane.showMessageDialog(null, "Movimentar Portas ou janelas ");
						  break;
					 case 2 :
						  JOptionPane.showMessageDialog(null, "Ver irnfomaçoes da casa ");
						  break;
				}
		   }while (opcao!=3);
		   EntradaSaida.msgEncerraPrograma();
		   System.exit(0);
		
	  }
}
