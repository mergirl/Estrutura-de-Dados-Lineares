package heap;

public class Heap implements interfaceheap {
	
	public int size;
	public boolean isEmpty;
	public int array[];
	
	public Heap() {
		array = new int[10];
		size = 0;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			isEmpty = true;
		}
		return false;
	}

	public void removeMin() {
		int raiz = this.array[1];
		int ultimo = this.array[size];
		
		raiz = ultimo;
		ultimo = (Integer) null;
		downheap();
	}

	public void insert(Object o) {
		this.array[++size] = (Integer) o;
		upheap();
		//return o;
	}

	public int min() {
		return array[1];
		
	}

	public void downheap() {
		// TODO Auto-generated method stub
		
	}

	public void upheap() {
		int aux = size;
		while(aux != 1 && this.array[aux] > this.array[aux/2]){
			int auxpai = this.array[aux/2];
			this.array[aux/2] = this.array[aux];
			this.array[aux] = auxpai;
			aux = aux/2;
		}
	}

}
