public class Example3_3 {
public static void main ( String args[] ) {
byte b = 22;
int n = 129;
float f = 123456.789f;
double d = 123456789.123456789;
System.out.println( "b =  " + b );
System.out.println( "n =  " + n );
System.out.println( "f =  " + f );
System.out.println( "d =  " + d );
b = (byte)n;     // 精度损失
f = (float)d;    // 精度损失
System.out.println( "b =  " + b );
System.out.println( "f =  " + f );
}
}