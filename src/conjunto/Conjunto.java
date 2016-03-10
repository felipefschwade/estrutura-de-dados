package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			this.tabela.add(new LinkedList<String>());
		}
	}
	public void adiciona(String palavra) {
		if (!contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			LinkedList<String> lista = this.tabela.get(indice);
			lista.add(palavra);
		}
	}
	public void remove (String palavra) {
		if (contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			LinkedList<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
		}
	}
	
	private boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		return this.tabela.get(indice).contains(palavra);
	}
	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26; //Pega a palavra, converte para minuscula, encontra a primeira letra e faz a verificação se ela estã entre 0 e 26
	}
	@Override
	public String toString() {
		return this.tabela.toString();
	}
}
