package conjunto;

import java.util.HashSet;

public class TestaConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Teste1");
		System.out.println(conjunto);
		conjunto.adiciona("Teste2");
		System.out.println(conjunto);
		conjunto.adiciona("Teste2");
		System.out.println(conjunto);
		conjunto.adiciona("Pedro1");
		System.out.println(conjunto);
		conjunto.remove("Teste2");
		System.out.println(conjunto);
		
		//Para utilizar o cojunto do Próprio Java
		HashSet<String> conjuntoJava = new HashSet<String>();
		conjuntoJava.add("Teste");
		conjuntoJava.add("Teste");
		conjuntoJava.add("Pedro");
		System.out.println(conjuntoJava);
	}
}
