package View;

import Model.Aberturas;

import javax.swing.*;
import java.util.ArrayList;

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
		 
		  String[] opcoes = {"Aberta", "Fechada"};
		int  option =  JOptionPane.showOptionDialog(null, "Qual o estado da "+ tipoDeAbertura,"estado",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,  opcoes, opcoes[0]);
		  if(option == 0 ) {
			  return "Aberta";
		  }else {
			  return "Fechada";
		  }
	 }
	 public static String solicitaTipoAbertura(){
		  String[] opcoes ={"Porta", "Janela"};
		  int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover", "Mover Abertura",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		  if(tipoAbertura==0){
			   return "Porta";
		  }else{
			   return "Janela";
		  }
	 }
	 public static int solicitaAberturaMover( ArrayList<Aberturas> listaDeAberturas){
		  String tipoDeAbertura = listaDeAberturas.get(0).getClass().getName();
		  tipoDeAbertura = tipoDeAbertura.replaceAll("Model.","");
		 System.out.println(tipoDeAbertura = listaDeAberturas.get(0).getClass().getName());
		  int qtdAbertura = listaDeAberturas.size();

		  String[] descricaoAberturas = new String[qtdAbertura];
		  for(int  i = 0; i<qtdAbertura; i++){
			   descricaoAberturas[i] = listaDeAberturas.get(i).getDescricao();
		  }
		  String msg = "Escolha a "+tipoDeAbertura+" a ser movimentada";
		  JComboBox exibicaoAberturas = new JComboBox(descricaoAberturas);
		  int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);

		  if(confirmacao == 0 ){
			   return exibicaoAberturas.getSelectedIndex();
		  }else{
			   return  -1 ;
		  }
	 }
	 public static void exibeMsgAbertura(){
		 JOptionPane.showMessageDialog(null, "Nenhuma Abertura será movimentada");
	 }
	 public static void exibeInfoCasa(String informacoes){
		 JOptionPane.showMessageDialog(null, informacoes, "Informações da Casa ", JOptionPane.INFORMATION_MESSAGE);
	 }
	 public static void MsgCasaNaoConstruida(){
		 JOptionPane.showMessageDialog(null, "A Casa Ainda nao foi construida!", "Casa não construida", JOptionPane.ERROR_MESSAGE);
	 }

	 
	 
}
