package Model;

import java.util.ArrayList;

public class Casa {
	 private String descricao;
	 private String cor;
	 private ArrayList<Aberturas>  listaDeportas = new ArrayList<Aberturas>();
	 private ArrayList<Aberturas> listaDejanelas = new ArrayList<Aberturas>();
	 
	 public String getDescricao() {
		  return descricao;
	 }
	 
	 public void setDescricao(String descricao) {
		  this.descricao = descricao;
	 }
	 
	 public String getCor() {
		  return cor;
	 }
	 
	 public void setCor(String cor) {
		  this.cor = cor;
	 }
	 
	 public ArrayList<Aberturas> getListaDeportas() {
		  return listaDeportas;
	 }
	 
	 public void setListaDeportas(ArrayList<Aberturas> listaDeportas) {
		  this.listaDeportas = listaDeportas;
	 }
	 
	 public ArrayList<Aberturas> getListaDejanelas() {
		  return listaDejanelas;
	 }
	 
	 public void setListaDejanelas(ArrayList<Aberturas> listaDejanelas) {
		  this.listaDejanelas = listaDejanelas;
	 }
	 public void constroiCasa(String descricao, String cor, ArrayList<Aberturas>listaDejanelas, ArrayList<Aberturas>listaDeportas){
		 setDescricao(descricao);
		  setCor(cor);
		  setListaDejanelas(listaDejanelas);
		  setListaDeportas(listaDeportas);
		  
	 }
	 public Aberturas retornaAbertura(int posicao, String tipoDeAbertura){
		 if (tipoDeAbertura.equalsIgnoreCase("porta")){
			return this.listaDeportas.get(posicao);
		 }else {
			 return this.listaDejanelas.get(posicao);
		 }
	 }
	 public void moverAbertura(Aberturas abertura, int novoEstado) {
		 abertura.setEstado(novoEstado);
	 }

		 public String gerarInfoCasa () {
			 String informacoes = "Descrição: " + this.descricao + "\nCor" + "\nLista De Portas";

			 for (Aberturas abertura : this.listaDeportas) {
				 int estado = abertura.getEstado();
				 informacoes += abertura.getDescricao() + "Estado: " + abertura.getEstado() + "\n";

			 }
			 informacoes+= "\nLista de janelas";
			 for(Aberturas abertura : this.listaDejanelas){
				 int estado = abertura.getEstado();
				 informacoes += abertura.getDescricao() + "Estado: "+ abertura.getEstado() + "\n";
			 }
			 return informacoes;
		 }




	 
}
