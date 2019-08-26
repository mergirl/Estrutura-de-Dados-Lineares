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
		this.redposi = 2;
	}
	
	public boolean isEmpty() {
		if(this.blackposi == 0 && this.redposi == 0) {
			return true;
		}
		return false;
	}
	public void duplicar() {
		this.novoArray = new Object[this.pilha.length * 2];
		for(int i = 0; i < blacksize; i++) {
			this.novoArray[i] = this.pilha[i];
		}
		
		for(int i = 0; i < redsize; i++) {
			this.novoArray[novoArray.length - 1 + i] = this.pilha[this.redposi + i];
		}
		
		this.redposi = this.novoArray.length - redsize;
		this.pilha = this.novoArray;
	}
	
		public String ToString() {
			for (int i = 0; i < pilha.length; i++) {
				System.out.print(pilha[i]+ ", ");
			}
			return "";
		}
		
		public int blacks() {
			return this.blacksize;
		}
		
		public int reds() {
			return this.redsize;
		}
		
		public void pushr(Object vred) {
			if (this.redposi - this.blackposi == 1) {
				duplicar();
			}
			
			this.pilha[--redposi] = vred;
			this.redsize++;
		}
		
		public void pushb(Object vblack) {
			if (this.redposi - this.blackposi == 1) {
				duplicar();
			}
			
			this.pilha[++blackposi] = vblack;
			this.blacksize++;
		}
		
		public Object popblack() throws VoidColor{
			if(isEmpty()) {
				throw new VoidColor("A pilha está vazia");
			}
			
			Object retorno = this.pilha[this.blackposi--];
			this.blacksize--;
			return retorno;
		}
		
		public Object popred() throws VoidColor{
			if(isEmpty()) {
				throw new VoidColor("A pilha está vazia");
			}
			
			Object retorno = this.pilha[this.redposi++];
			this.redsize--;
			return retorno;
		}
		
		public Object blacktop() throws VoidColor {
			if (isEmpty()) {
				throw new VoidColor("A pilha está vazia");
			}
			return this.pilha[this.blackposi];
		}
		
		public Object redtop() throws VoidColor{
			if (isEmpty()) {
				throw new VoidColor("A pilha está vazia");
			}
			return this.pilha[this.redposi];
		}
}
