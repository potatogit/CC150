import java.util.*;
public class Main {
	public static int a[]=new int[10005];
	public static void main(String argc[]){
			while(true){
				Scanner cin=new Scanner(System.in);
				System.out.println(1<<31-1);
				int a=cin.nextInt(),b=cin.nextInt();
				System.out.println(getAnswer(a,b));
			}
	}
	public static int getAnswer(int a,int b){
		int k=(a-b)>>31&0x1;//(负数)>>31的结果居然是-1，说明移位时符号位并没有被0填充
		return (1^k)*a+k*b;
	}
}
/*上述方法并不能比较诸如MAXINT-3,-5的问题，因为a-b会溢出?*/
