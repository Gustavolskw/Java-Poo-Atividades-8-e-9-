package View;

import javax.swing.*;

public class EntradaSaida {
	 public static int solicitaOpcao(){
		  String [] opcoes = {"Construir Casa ", "Movimentar Portas ou janelas ", "Ver Informaçoes da casa ", "Sair do Programa "};
		  JComboBox<String> menu = new JComboBox<>(opcoes);
		  JOptionPane.showConfirmDialog(null, menu, "Selecione a Opçao desejada.", JOptionPane.DEFAULT_OPTION);
		  return menu.getSelectedIndex();
	 }
	 public static void msgEncerraPrograma(){
		  JOptionPane.showMessageDialog(null, "O programa será encerrado");
	 }
	 public static String solicitaDescricao(String descricao, int ordem){
		  if (ordem == 0){
			  return JOptionPane.showInputDialog("informe a descrição da "+ descricao);
		  }else {
			   return JOptionPane.showInputDialog("informe a descrição da "+ordem+" "+ descricao);
		  }
		  
	 }
	 public static String solicitaCor(){
		  return JOptionPane.showInputDialog("Informe a cor da casa");
	 }
	 public static int solicitaQntdAberturas(String abertura ){
		return Integer.parseInt(JOptionPane.showInputDialog("informe a Quantidade de "+ abertura));
	 }
	 public static String solicitaEstado(String tipoDeAbertura){
		  String estado;
		  String[] opcoes = {"Aberta", "Fechada"};
		  int opcao =  JOptionPane.showOptionDialog(null, "Qual o estado da "+ tipoDeAbertura,"estado",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,  opcoes, opcoes[0]);
	 if(opcao == 0){
		  estado = "Aberta";
	 }else{
		  estado = "Fechada";
	 }
	 return estado;
	 }
	 
	 
}
