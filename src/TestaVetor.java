
public class TestaVetor {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro");
		Aluno a2 = new Aluno("José");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista);
		Aluno a3 = new Aluno("Danilo");
		System.out.println(lista.contem(a2));
		lista.adiciona(1, a3);
		System.out.println(lista);
		lista.remove(1);
		System.out.println(lista);
		for (int i = 0; i < 300; i++) {
			Aluno aluno = new Aluno("TESTE" + i);
			lista.adiciona(aluno);
		}
		System.out.println(lista);
	}
}
