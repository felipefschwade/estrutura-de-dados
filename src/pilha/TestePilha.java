package pilha;

import java.util.Stack;

public class TestePilha {
	public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//		pilha.insere("Teste 1 ");
//		System.out.println(pilha);
//		pilha.insere("Teste 2 ");
//		System.out.println(pilha);
//		String r1 = pilha.remove();
//		System.out.println(r1);
//		System.out.println(pilha);
//		pilha.remove();
//		System.out.println(pilha);
//		System.out.println(pilha.vazia());
		Stack<String> stack = new Stack<String>();
		stack.push("Teste 1");
		stack.push("Teste 2");
		System.out.println(stack);
		System.out.println(stack.pop());
	}
}
