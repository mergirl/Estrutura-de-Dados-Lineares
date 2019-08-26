package Rubro_Negra;

public class Main {

	public static void main(String[] args) throws VoidColor {
		PilhaColor p = new PilhaColor();
		
		p.pushb("black");
		p.pushr("red");
		p.pushr("red");
		p.pushb("black");
		p.pushb("black");
		p.pushr("red");
		
		System.out.println(p.blacktop());
		System.out.println(p.redtop());
		System.out.println(p.ToString());
	}

}
