package Fila;

public class Fila {
	
	private Object[] fila;
	private int first;
	private int last;
	private int tamanho;
	private Object[] novoArray;
	
	public Fila() {
		this.fila = new Object[1];
		this.first = 0;
		this.last = 0;
		this.tamanho = 0;
	}
	
	public void enfileirar(Object elemento) {
		if (isFull()) {
			//duplicando
			novoArray = new Object[this.fila.length * 2];
			for (int i = 0, j = fila.length; i != fila.length; i++, j++) {
				novoArray[i] = this.fila[j % fila.length];
			}
			this.fila = this.novoArray;
			this.first = 0;
			this.last = size();
		}
		//finalmente adicionando o elemento
		this.fila[this.last] = elemento;
		last = last + 1 % fila.length;
		tamanho++;
	}
	public Object retirar() throws EEmpty {
		if(isEmpty()) {
			throw new EEmpty("Fila Vazia");
		}
		
		Object elemento;
		elemento = this.fila[this.first];
		this.first = this.first + 1 % fila.length;
		tamanho--;
		return elemento;
		
	}
	public boolean isEmpty() {
		return tamanho == 0;
	}
	public boolean isFull() {
		return tamanho == fila.length;
	}
	public int size() {
		return tamanho;
	}
}
