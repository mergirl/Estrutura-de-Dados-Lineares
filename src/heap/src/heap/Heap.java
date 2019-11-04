package heap;

public class Heap implements InterfaceHeap {

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

	public Object min() {
		return this.array[1];

	}

	public void downheap() {
		int painho = 1, esq, dir, k = 0;
		
		while (true) {
			esq = 2 * painho;
			dir = 2 * painho + 1;
			//verifica qual lado � o filho folha
			if (esq > size && dir > size) {
				break;
			//verifica tamb�m se � menor que os filhos
			} else if ((((Integer) this.array[painho]) < ((Integer) this.array[esq])
					&& (Integer) this.array[painho] < (Integer) this.array[dir])) {
				break;
			//se nenhuma condi��o for verdadeira, verifica qual dos filhos � o menor e armazena na vari�vel k
			} else {
				if ((Integer) this.array[dir] < (Integer) this.array[esq]) {
					k = dir;
				} else {
					k = esq;
				}
			}
			//realiza a troca do pai maior com o filho menor
			int auxpai = (Integer) this.array[k];
			this.array[k] = this.array[painho];
			this.array[painho] = auxpai;
			//atualiza a variavel pai para continuar a verifica��o
			painho = k;
		}
	}

	public void upheap() {
		int aux = size;
		//verifica se o n� � raiz ou se o filho � maior que o pai
		while (!(aux == 1 || (Integer) this.array[aux] > (Integer) this.array[aux / 2])) {
			//se passar no while, significa que o n� a ser trocado n�o � raiz e tamb�m � menor que o pai.
			int auxpai = (Integer) this.array[aux / 2];
			this.array[aux / 2] = this.array[aux];
			this.array[aux] = auxpai;
			aux = aux / 2;
		}
	}

	public void insert(Object o) {
		this.array[++size] = o;
		upheap();
	}

	public void display() {
		for(int i = 1; i <= size; i++){
			if(i == size) System.out.print(this.array[i] + "\n");
			else System.out.print(this.array[i] + "-");
		}
		
		
	}

}
