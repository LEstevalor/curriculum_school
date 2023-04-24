public class Lader {
	double 上底,高;             //实例变量（不同对象的实例变量互不相同，但却可共享类变量）
	static double 下底;         //类变量  （一旦类的字节码文件被加载到内存，类变量就会同时被分配相应的内存空间，而实例变量不会）
	void 设置上底(double a) {   
		上底 = a;               //类创建对象，对不同对象的实例变量会分配不同的内存空间，但对类变量不会重新分配内存空间
	}                           
	void 设置下底(double b) {
		下底 = b;
	}
	double 获取上底() {
		return 上底;
	}
	double 获取下底() {
		return 下底;
	}
}