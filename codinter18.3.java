import java.util.*;
public class Main {
	public static void main(String argc[]){
		int a[]=new int[52];
		for(int i=0;i<52;i++){
			a[i]=i;
		}
		int ans[]=get(a,5);
		for(int i=0;i<5;i++) System.out.println(ans[i]);
	}
	public static int[] get(int o[],int m){
		int ans[]= new int[m];
		for(int i=0;i<m;i++){
			ans[i]=o[i];
		}
		for(int i=m;i<o.length;i++){
			int r=random(0,i);
			if(r<m) ans[r]=o[i];
		}
		return ans;
	}
	public static int random(int a,int b){
		return a+(int)(Math.random()*(b-a+1));
	}
}
