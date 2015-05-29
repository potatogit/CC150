import java.util.*;
public class Main {
	public static void main(String argc[]){
		int a[]=new int[52];
		for(int i=0;i<52;i++){
			a[i]=i;
		}
		shuffle(a);
		for(int i=0;i<52;i++){
			System.out.println(a[i]);
		}
	}
	public static void shuffle(int a[]){
		for(int i=0;i<a.length;i++){
			int r=random(0,i);
			int temp=a[r];
			a[r]=a[i];
			a[i]=temp;
		}
	}
	public static int random(int a,int b){//取a到b之间的随机数，包括a，b
		return a+(int)(Math.random()*(b-a+1));
	}
}
