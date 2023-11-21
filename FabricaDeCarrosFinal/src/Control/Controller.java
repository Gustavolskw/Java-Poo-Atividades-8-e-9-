package Control;

import View.DataInOut;

import javax.swing.*;

public class Controller {
	 public void showMenu(){
		  int option;
		  
		  do{
			   option = DataInOut.requestOption();
			   
			   switch (option){
					case 0:
						 JOptionPane.showMessageDialog(null, "Construir Um Carro" );
						 break;
					case 1:
						 JOptionPane.showMessageDialog(null, "Ver Listas de carros" );
						 break;
					case 2:
						 JOptionPane.showMessageDialog(null, "Sair" );
						 break;
			   }
			   
		  }while(option!=2);
		  DataInOut.showExitmessage();
		  System.exit(0);
	 }
	 
	 
	 
	 
	 
}
