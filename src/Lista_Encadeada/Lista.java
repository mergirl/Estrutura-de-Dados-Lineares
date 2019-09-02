package Lista_Encadeada;

public class Lista {
	No first;
	No last;
	int qtd = 0;
	
	public Lista() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		if (qtd == 0) {
			return true;
		}
		return false;
	}
	
	public void enfileirar(Object elemento) {
		No novoNo = new No(elemento);
		
		if (isEmpty()) {
			this.first = novoNo;
			this.last = novoNo;
		}
		
		else {
			last.setProximo(novoNo);
			last = novoNo;
		}
		qtd++;
	}
	public void desenfileirar() throws EEmpty{
		if (isEmpty()) {
			throw new EEmpty("Fila Vazia");
		}
		else if (last == first) {
			first = null;
			qtd--;
		}
		else {
			No auxiliar = first;
			auxiliar = first.getProximo();
			first = auxiliar;
			qtd--;
		}
	}
	public Object size() {
		return qtd;
	}
}
