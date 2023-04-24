public class MainClass {
	public static void main(String args[]) {
		Village zhaoZhuang,maJiaHeZhi;
		zhaoZhuang = new Village("赵庄");
		maJiaHeZhi = new Village("马家河子");
		zhaoZhuang.peopleNumber = 100;
		maJiaHeZhi.peopleNumber = 150;
		Village.treeAmount = 200;            //引用类变量
		int leftTree = Village.treeAmount;
		System.out.println("森林中有" + leftTree + "棵树");
		zhaoZhuang.treePlanting(50);         //对象调用实例方法
//		Village.treePlanting(50);            // ×  无法从静态上下文中引用非静态 方法 。 
		leftTree = maJiaHeZhi.lookTreeAmount(); //对象调用类方法（静态方法）
		System.out.println("森林中有" + leftTree + "棵树");
		maJiaHeZhi.fellTree(70);
		leftTree = Village.lookTreeAmount();    //用类名调用类方法（静态方法）
		System.out.println("森林中有" + leftTree + "棵树");
		System.out.println("赵庄的人口：" + zhaoZhuang.peopleNumber);
		zhaoZhuang.addPeopleNumber(12);
		System.out.println("赵庄的人口：" + zhaoZhuang.peopleNumber);
	}
}