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
			try {
				Object x = fila.retirar();
				System.out.println("Removido o Objeto " + x + " da fila");
				System.out.println("Tamanho atual da fila: " + fila.size() + "\n");
				} 
			
			catch (Exception e){
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		try {
			Object y = fila.retirar();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}
