import java.util.*;
public class Main {
	public static void main(String argc[]){
		while(true){
			Scanner cin =new Scanner(System.in);
			int a=cin.nextInt(), b=cin.nextInt();
			b=a-b;
			a=a-b;
			b=a+b;
//			a=a*b;  //b,a不能为0
//			b=a/b;
//			a=a/b;
			System.out.println(a+" "+b);
		}
	}
}
/*
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
*/
