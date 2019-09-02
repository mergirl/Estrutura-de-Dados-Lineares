package Lista_Encadeada;

import java.util.Scanner;

public class Main {

	public static void menu() {
	System.out.println("Digite uma opção para a operação desejada");
	System.out.println("| 1 | - enfilei1rar\n| 2 | - desinfileirar\n| 3 | - size\n| 4 | - sair");
			
	}
		
	public static void main(String[] args) throws EEmpty {
		Lista l = new Lista();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			menu();
			opcao = sc.nextInt();
			
			if (opcao == 1) 
			{
				System.out.println("O que deseja enfileirar?");
				l.enfileirar(sc.next());
			}
			if (opcao == 2) 
			{
				try {
					l.desenfileirar();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
			if (opcao == 3) 
			{
				System.out.println(l.size());
			}
			
		} while (opcao != 4);

	}

}
