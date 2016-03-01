
public class TestaListaLigada {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
	
		lista.adicionaNoComeco("Paulo");
		lista.adicionaNoComeco("Pedro");
		lista.adicionaNoComeco("Thiago");
		lista.adiciona("Japa");
		System.out.println(lista);
		lista.adiciona(2, "Jonas");
		System.out.println(lista);
		
		Object X = lista.pega(3);
		System.out.println(X);
		
	}
}
