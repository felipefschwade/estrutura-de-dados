package pilha;

import java.util.List;
import java.util.LinkedList;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	
	public void insere(String nome) {
		nomes.add(nome);
	}
	public String remove() {
		return nomes.remove(nomes.size() - 1);
	}
	public boolean vazia() {
		return nomes.isEmpty();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomes.toString();
	}
}
