public class ab {
	public static void main(String args[]) {
		double d = 0.02;
		double r;  
		double u1 = 1.8e+5;
		double u0 = 3e+5;
		double d2 = 3*d/4, d1 = d/4;
		r = d2/((u1*d)/u0 - d1);
		System.out.println(r);
	}
}