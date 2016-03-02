
public class TestaListaLigada {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
	
		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);	
		lista.adicionaNoComeco("Pedro");
		System.out.println(lista);	
		lista.adicionaNoComeco("Thiago");
		System.out.println(lista);	
		lista.adiciona("Japa");
		System.out.println(lista);	
		lista.adiciona(2, "Joao");
		System.out.println(lista);	
		lista.remove(4);
		System.out.println(lista);
		System.out.println(lista.contem("Joao"));
	}
}
