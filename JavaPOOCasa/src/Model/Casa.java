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
	 
}
