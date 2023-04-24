public class E{
	public static void main(String args[]){
		byte []b = "abcŒ“√«œ≤ª∂¿∫«Ú".getBytes();
		System.out.println(b.length);
		String s = new String(b,0,7);
		System.out.println(s);

		System.out.println("abc" == "abc");
		System.out.println("abc".equals("abc"));
	}
}
