package fila;

public class TestaFila {
	public static void main(String[] args) {
		Fila alunos = new Fila();
		alunos.adiciona("Iago");
		alunos.adiciona("Jose");
		System.out.println(alunos);
		alunos.remove();
		System.out.println(alunos);
	}
}
