import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Formas fm = new Formas();
		Quadrado qd = new Quadrado();
		Retangulo ret = new Retangulo();
		Triagulo tri = new Triagulo();
		Trapezio tra = new Trapezio();
		
		int base,h;
		String forma;
		
		System.out.println("Digite a base:");
		base = in.nextInt();
		System.out.println("Digite a altura:");
		h = in.nextInt();
		
		System.out.println("Qual forma voce vai precisa saber a area? Quadrado,Triangulo,Retatangulo,Trapezio");
			forma = in.next(); 
		
		if(forma.equalsIgnoreCase("Quadrado")){
			System.out.print("A area e:" + qd.getCalculandoArea (base, h) );
		}else if(forma.equalsIgnoreCase ("Triangulo")) {
			System.out.print("A area e:" + tri.getCalculandoArea (base, h) );
		}else if(forma .equalsIgnoreCase("Retatangulo")) {
			System.out.print("A area e:" + ret.getCalculandoArea (base, h) );
		}else {
			System.out.print("A area e:" + tra.getCalculandoArea (base, h) );

		}
			
		
			
		

		
		
		
	}

}
