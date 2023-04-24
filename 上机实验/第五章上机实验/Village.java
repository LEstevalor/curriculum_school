class Village {                   //友好类
	static int treeAmount;        //树木数量(静态变量)（类变量）
	int peopleNumber;             //村庄人数（友好变量）
	String name;                  //村庄名字
	Village(String s) {           //构造方法
		name = s;
	}   
	void treePlanting(int n) {    //友好方法
		treeAmount += n;
		System.out.println(name + "植树" + n + "棵");
	}
	void fellTree(int n) {        //友好方法
		if(treeAmount - n >= 0) {
			treeAmount -= n;
			System.out.println(name + "伐树" + n + "棵");
		}
		else{
			System.out.println("无树可伐");
		}
	}
	static int lookTreeAmount() {  //类方法（静态方法）
		return treeAmount;
	}
	void addPeopleNumber(int n) {
		peopleNumber += n;
		System.out.println(name + "增加了" + n + "人");
	}
}