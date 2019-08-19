package Rubro_Negra;

public class PilhaColor {
	public Object pilha[];
	public int blackposi;
	public int blacksize;
	
	public int redposi;
	public int redsize;
	
	public Object novoArray[];
	
	public PilhaColor() {
		this.pilha = new Object[2];
		this.blackposi = -1;
		this.redposi = -1;
	}
	
	public boolean isEmpty() {
		if(this.blackposi == 0 && this.redposi == 0) {
			return true;
		}
		return false;
	}
	public void duplicar() {
		this.novoArray = new Object[this.pilha.length * 2];
		for(int i = 0; i < pilha.length; i++) {
			this.novoArray[i] = this.pilha[i];
		}
		
		for(int i = 0; i < pilha.length; i++) {
			this.novoArray[novoArray.length - 1 + i] = this.pilha[this.redposi + i];
		}
		
		this.redposi = this.novoArray.length - redsize;
		this.pilha = this.novoArray;
	}
}
