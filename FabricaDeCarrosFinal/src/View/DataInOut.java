package View;

import javax.swing.*;

public class DataInOut {
	 public static int requestOption(){
		  String [] option = {"Construir Um Carro ", "Ver lista de carros  ", "Sair"};
		  JComboBox<String> menu = new JComboBox<>(option);
		  JOptionPane.showConfirmDialog(null, menu, "Selecione a Opçao desejada.", JOptionPane.DEFAULT_OPTION);
		  return menu.getSelectedIndex();
		 
	 }
	 public static void showExitmessage(){
		  JOptionPane.showMessageDialog(null, "O programa será Finalizado");
	 }
	 
	 
	 
	 
	 
	 
	 
}
