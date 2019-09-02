package Fila;

public class Main {

	public static void main(String[] args) throws EEmpty {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();
		
		fila.enfileirar("A");
		fila.enfileirar("B");
		fila.enfileirar("C");
		fila.enfileirar("D");
		fila.enfileirar("E");
		
		System.out.println("Tamanho da fila: " + fila.size() + "\n"+"\n");
		System.out.println("PAINEL DE OPERAÇÕES\n");
	
		while(!fila.isEmpty()){
			System.out.println("Elemento removido: " + fila.first());
			fila.retirar();
		} 
	}		

}
