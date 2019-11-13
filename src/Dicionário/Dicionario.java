package Dicionário;

public class Dicionario implements InterfaceDi {
	public int size;
	public int hash[];

	public Dicionario() {
		this.hash = new int[13];
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int findElement(int k) throws HashException {
		int index = (k + 0 * 1) % hash.length;
		for (int j = 1; j < hash.length; j++) {
			if (this.hash[index] == 0) {
				throw new HashException("NO SUCH KEY");
			} else if (this.hash[index] == k) {
				return index;
			} else
				index = (k + j * 1) % hash.length;
		}
		return 0;
	}

	@Override
	public int removeElement(int k) throws HashException {
		int index = this.findElement(k);
		this.hash[index] = 0;
		this.size--;
		return k;
	}

	@Override
	public void insertItem(int k) {
		if (size == hash.length / 2) {
			this.duplicar();
		} else {
			// (k+jd(k)) mod N
			for (int j = 0; j < hash.length; j++) {
				int index = (k + j * 1) % hash.length;
				if (this.hash[index] == 0) {
					this.hash[index] = k;
					this.size++;
					j = hash.length;
				}
			}
		}
	}

	public void duplicar() {
		int novoHash[] = new int[17];
		for (int i = 0; i < this.hash.length; i++) {
			if (hash[i] != 0) {
				for (int j = 0; j < novoHash.length; j++) {
					int index = (hash[i] + j * 1) % novoHash.length;
					if (novoHash[index] == 0) {
						novoHash[index] = hash[i];
						j = novoHash.length;
					}
				}
			}
		}
		this.hash = novoHash;
	}

	public void display() {
		for (int i = 0; i < hash.length; i++) {
			System.out.println("|"  + i + "|"+ "|" + this.hash[i] + "| ");
		}
	}
}
