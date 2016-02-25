import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	private void garanteEspaco() {
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	public void adiciona(int posicao, Aluno aluno){
		this.garanteEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao > this.totalDeAlunos;
	}
	public Aluno pega(int posicao) {
		if (this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return alunos[posicao];
	}
	public void remove(int posicao){
		for (int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = alunos[i+1];
		}
		this.totalDeAlunos--;
	}
	public boolean contem(Aluno aluno){
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	public int tamanho(){
		return totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}
	
}	