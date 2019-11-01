package heap;

public class Heap implements interfaceheap {
	
	public int size;
	public boolean isEmpty;
	public Object array[];
	
	public Heap() {
		array = new Object[1000];
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
		
		this.array[1] = this.array[this.size];
		size--;

		downheap();
	}

	public void insert(Object o) {
		this.array[++size] = (int) o;
		upheap();
	}

	public Object min() {
		return this.array[1];
		
	}

	public void downheap() {
		//a raiz precisa ser menor que o nó atual e o nó atual precisa ser menor que os filhos.
		//se o nó for uma folha, o while para.
		int painho = 1, esq, dir, k = 0; 
		while (true) {
			esq = 2*painho;
			dir = 2*painho + 1;
			if (( ((int) this.array[painho]) < ((int) this.array[esq]) && (int)this.array[painho] < (int)this.array[dir]) || painho > this.size ) {
				break;
			}
			if (this.array[esq] == (Integer)null) {
				if (this.array[dir] != (Integer)null) {
					if (this.array[dir] < this.array[esq]) k = dir;
					else k = esq;
				}
			}else k = esq;
			
			if ((int) this.array[k] < (int) this.array[painho]) {
				int auxpai = this.array[k];
				this.array[k] = this.array[painho];
				this.array[painho] = auxpai;
			}
			painho = k;
		}
		
		
	}

	public void upheap() {
		int aux = size;
		while(!(aux == 1 || this.array[aux] > this.array[aux/2])){
			int auxpai = this.array[aux/2];
			this.array[aux/2] = this.array[aux];
			this.array[aux] = auxpai;
			aux = aux/2;
		}
	}

}
