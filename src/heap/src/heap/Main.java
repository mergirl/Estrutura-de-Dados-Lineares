package heap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Heap h = new Heap();
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("1 - insert\n2-remover\n3-size\n4-min\n5-mostrar\n6-sair");
		op = sc.nextInt();
			
			if (op == 1) {
				h.insert(1);			
				h.insert(2);
				h.insert(3);
			}
			if (op == 2) {
				h.removeMin();
			}
			if (op == 3) {
				System.out.println(h.size());
			}
			
			if (op == 4) {
				System.out.println(h.min());
			}
			if (op == 5) {
				h.display();
			}
			
		} while (op != 6);

	}

}

