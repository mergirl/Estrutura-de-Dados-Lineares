package Pilha;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("Digite a operação desejada");
		System.out.println("1- push\n2- pop\n3- top\n4- size\n5- sair");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha p = new Pilha();
		String opcao;
		
		do {
			menu();
			Scanner sc = new Scanner(System.in);
			opcao = sc.next().toUpperCase().toLowerCase();
			
			if (opcao.equals("1")) {
				System.out.println("O que deseja empilhar?");
				p.push(sc.next());
			}
			
			if (opcao.contentEquals("2")) {
				try {
					p.pop();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if (opcao.equals("3")) {
				try {
					System.out.println(p.top());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if (opcao.equals("4")) {
				System.out.println(p.size());
			}
		} while (!opcao.equals("sair"));
	}

}
