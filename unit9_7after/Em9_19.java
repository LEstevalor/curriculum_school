import java.util.regex.*;    //����Pattern���Matcher��İ�
public class Em9_19{
	public static void main(String args[]){
		Pattern p;           //ģʽ����
		Matcher m;           //ƥ�����
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		p = Pattern.compile(regex);           //��ʼ��ģʽ����
		String s = "�廪��ѧ��ַ:www.tsinghua.edu.cn,�ʵ���������ַ:http://www.ptpress.com";
		m = p.matcher(s);                     //�ô�ƥ���ַ����г�ʼ��ƥ�����
		while(m.find()){
			String str = m.group();
			System.out.println(str);
		}    
		System.out.println("�޳��ַ����е���վ��ַ��õ����ַ���:");
		String result = m.replaceAll(" ");
		System.out.println(result);
	}
}
/*
ģʽƥ�䣺
1 Pattern�ഴ��һ�����󡪡�ģʽ����������ʽ�ķ�װ����
2 Pattern.compile(String regex)����ģʽ����regex��������ʽ������Ҳ���෽����compile(String regex,int flags)��

ƥ�����
Matcher�������� = Pattern����.matcher(�ַ���) ���� ƥ�����;
����Ӧ���� ���� boolean���͵�find()/matches()/lookingAt()/find(int start);
            String���͵�replaceAll(String replacement)/replaceFirst(String replacement);
*/


            
