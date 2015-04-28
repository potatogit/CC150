import java.util.*;
public class Main {
	public static void main(String argc[]){
			while(true){
				Scanner cin=new Scanner(System.in);
				int n=cin.nextInt();
				System.out.println(getAnswer(n));
			}
	}
	public static int getAnswer(int n){
		int count=0;
		while((n/=5)!=0){
			count+=n;
		}
		return count;
	}
}
