public class People_ {
	int leg,hand;
	String name;
	People_(String s){  //在构造方法中使用this
		name = s;
		this.init();   //此处this可不加
	}
	void init(){
		leg = 2;
		hand = 2;
		System.out.println(name + "有" + hand + "只手" + leg + "条腿");
	}
	public static void main(String args[]) {
		People_ boshi = new People_("布什");   //创建boshi时，构造方法中的this就是对象boshi
	}
}

