package Fila;

public class Fila {
	
	private Object[] fila;
	private int s = 0;
	private int r = s;
	private int capacidade = 5;
	private Object[] array = new Object[capacidade];
	
	
	public void enfileirar(Object elemento) {
		if(size() == array.length - 1) {
			Object[] temporario = new Object[array.length * 2];
			int ss = s;
			for(int ff = 0; ff < array.length - 1; ff++) {
				ss = (ss + 1)%array.length;
			}
			array = temporario;
			r = size();
			s = 0;
		}
		array[r % array.length] = elemento;
		r++;
	}
	public Object retirar() throws EEmpty {
		if(isEmpty()) {
			throw new EEmpty("Fila vazia");
		}
			Object temporario = array[s];
			
			s = (s + 1) % array.length;
			
			return temporario;
	}


	public boolean isFull() {
		return capacidade == fila.length;
	}
	public int size() {
		return (array.length - s + r) % array.length;
	}
	
	public boolean isEmpty() {
		return fila.length == 0;
	}
	
	public Object first() throws EEmpty{
		if(isEmpty()) {
			throw new EEmpty("Fila vazia");
		}
		return fila[s];
	}
	
}
