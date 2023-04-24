public class Example5_7 {
	public static void main(String args[]) {
		Lader.下底 = 100;        //类变量甚至可以用类名访问（可对象访问，也可类访问）
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		laderOne.设置上底(28);
		laderTwo.设置上底(66);
//		laderTwo.设置下底(5);    //则两个对象的下底全变为5，因为下底这个类变量是共享的（也就是说，改变一个对象的类变量，那么全部对象的类变量全部改变为同一个）
		System.out.println(laderOne.获取上底());
		System.out.println(laderOne.获取下底());
		System.out.println(laderTwo.获取上底());
		System.out.println(laderTwo.获取下底());
	}
}