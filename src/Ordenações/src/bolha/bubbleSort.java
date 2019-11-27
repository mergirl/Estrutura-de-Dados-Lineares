package bolha;

public class bubbleSort {

	public static void bubbleSort(int array[], int n) {
		
		if (n == 1)
			return;
		
		for (int i=0; n - 2; i++) {
			for (int j = 0; n - 2 - i; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}

	}

}
