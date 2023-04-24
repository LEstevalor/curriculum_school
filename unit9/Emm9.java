public class Emm9{
	public static void main(String args[]){
		String s = "1 haha 2 a 3 ab";
		String regex = "[a-zA-Z]+";       //string.replaceAll(regex,replacement) 都是String，将regex部分全部替换为replacement
		System.out.println(s.replaceAll(regex,"哈哈"));  //结果：1 哈哈 2 哈哈 3 哈哈

		s = "dawdadadwdadawda";
		System.out.println(s.replaceAll(regex,"哈哈"));  //结果：哈哈

		regex = "[\\s\\d\\p{Punct}]+";  //空格、数字、各种符合组成的正则表达式
		String string = "What are you doing!";
		String []words = string.split(regex);     //string.split(String regex)对应的方法 
		for(int i = 0; i < words.length; i++){
   			int m = i + 1;
			System.out.println("单词" + m + "：" + words[i]);
		} 
	}


