package Rubro_Negra;

public class Main {

	public static void main(String[] args) throws VoidColor {
		PilhaColor p = new PilhaColor();
		
		p.pushb(1);
		p.pushr(2);
		p.pushr(3);
		p.pushb(4);
		p.pushr(5);
		
		System.out.println(p.blacktop());
		System.out.println(p.redtop());
		System.out.println(p.ToString());
	}

}
