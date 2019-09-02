package Fila;

public class Main {

	public static void main(String[] args) throws EEmpty {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();
		
		fila.enfileirar("A");
		fila.mostrar();
		fila.enfileirar("B");
		fila.mostrar();
		fila.enfileirar("C");
		fila.mostrar();
		fila.enfileirar("D");
		fila.mostrar();
		fila.enfileirar("E");
		fila.mostrar();
		System.out.println("Tamanho da fila: " + fila.size() + "\n"+"\n");
		fila.retirar();
		fila.mostrar();
		System.out.println("Tamanho da fila: " + fila.size() + "\n"+"\n");
	
		//fila.retirar();
	}		

}
