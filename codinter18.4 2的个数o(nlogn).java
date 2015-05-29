import java.util.*;
public class Main {
	public static void main(String argc[]){
		Scanner cin=new Scanner(System.in);		
		while(true){
			int i=cin.nextInt();
			System.out.println(getAns(i,2));
		}
	}
	public static int getAns(int o,int m){
		int count=0;
		for(int i=1;i<=o;i++){
			count+=get(i,m);
		}
		return count;
	}
	public static int get(int i,int m){
		int count=0;
		while(i!=0){
			int temp=i%10;
			if(temp==m) count++;
			i/=10;
		}
		return count;
	}
}
