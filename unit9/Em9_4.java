public class Em9_4{
	public static void main(String args[]){   //参数args能接收用户从键盘输入的字符串（用java.exe执行主类）
		double average = 0;
		double sum = 0;
		double item = 0;
		boolean computable = true;
		for(String s:args){
			if(s.equals(String.valueOf(Integer.parseInt(s)))){    //结果是true，s == String.valueOf(Integer.parseInt(s))为什么不行，想想
				System.out.println("阿巴");                       //输出↑阿巴
			}
			try{
				item = Double.parseDouble(s);    //Integer.parseInt() ——》字符变数字
				sum += item;
			}
			catch(NumberFormatException e){
				System.out.println("输入非法数字字符" + e);
				computable = false;
			}
		}
		if(computable){                                     //↓对应的String.valueOf 都可以（变为字符）
			System.out.println("sum = " + sum);             //此外还有Byte.parseByte ,Short.parseShort 等等等
		}
	}
}