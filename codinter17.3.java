import java.util.*;
public class Main {
	public static int a[]=new int[10005];
	public static void main(String argc[]){
			while(true){
				Scanner cin=new Scanner(System.in);
				int n=cin.nextInt();
				System.out.println(getAnswer(n));
			}
	}
	public static int getAnswer(int n){
		if(n<=4) return 0;
		if(a[n]!=0) return a[n];
		int temp=n,count=0;
		while(temp%5==0)
	    {
				temp/=5;
				count++;
	    }
		return getAnswer(n-1)+count;
	}
}
