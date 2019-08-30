package Lista_Encadeada;

public class No {
	private Object elemento;
	No proximo;
	
	public No(Object elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
	
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public No getProximo() {
		return proximo;
	}
}
