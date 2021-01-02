
public class Intel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectaangle rec = new Rectaangle();
		Circle ci = new Circle();
		Area are;
		are = rec;
		System.out.println("area of rectangle is "+ are.calculation(15,10));
		are = ci;
		System.out.println("area of circle is "+ are.calculation(16, 0));
		
	}

}
