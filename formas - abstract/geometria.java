public abstract class Geometria{
    	public int base;
		public int h;
		public int area;
		


		public void setCalculandoArea(int base, int h) {
			this.base = base;
			this.h = h;

		}

        
public class Quadrado extends Formas {
	
	public  int getCalculandoArea(int base, int h) {
		this.base=base;
		this.h=h;
			return area = base*h;
		
	}
	
}

public class Retangulo extends Formas{
	
	public  int getCalculandoArea(int base, int h) {
		this.base=base;
		this.h=h;

		return area = base*h;
	
	}
}

public class Trapezio  extends Formas{
	
	public int getCalculandoArea(int base, int h) {
		this.base=base;
		this.h=h;

		return area = ((base+base)*h)/2;
	}


}

public class Triagulo extends Formas {
	
	public int getCalculandoArea(int base, int h) {
		this.base=base;
		this.h=h;

		return area = (base*h)/2;
	}

}
}