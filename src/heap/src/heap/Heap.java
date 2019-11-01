package heap;

public class Heap implements interfaceheap {
	
	public int size;
	public boolean isEmpty;
	public int array[];
	
	public Heap(Object o) {
		array = new int[10];
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			isEmpty = true;
		}
		return false;
	}

	@Override
	public void removeMin() {
		int novaraiz;
		int novoultimo;
		
		novaraiz = this.array[size];
		novoultimo = this.array[size - 1];
		
		this.array[1] = novaraiz;
		this.array[size] = novoultimo;
		
	}

	@Override
	public Object insert(Object o) {
		this.array[++size] = (int) o;
		upheap();
		return o;
	}

	@Override
	public void min() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downheap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upheap() {
		int aux = size;
		while(aux != 1 || this.array[aux] > this.array[aux/2]){
			int auxpai = this.array[aux/2];
			this.array[aux/2] = this.array[aux];
			this.array[aux] = auxpai;
			aux = aux/2;
		}
	}

}
