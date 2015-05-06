import java.util.*;
public class Main {
	public static void main(String argc[]){
		Scanner cin= new Scanner (System.in);
		int a[]={-2,-1,0,3,5,6,7,9,13,14};
		getAns(a,10,12);
	}
	public static void getAns(int a[],int n,int sum){
		Hashtable <Integer,Boolean> ht=new Hashtable<Integer,Boolean>();
		for(int i=0;i<n;i++){
			if(ht.containsKey(sum-a[i])) System.out.println(a[i]+","+(sum-a[i]));
			ht.put(a[i],true);		
		}
	}
}
