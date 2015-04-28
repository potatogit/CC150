import java.util.*;
public class Main {
	public static void main(String argc[]){	
		Person a[]=new Person[6];
		a[0]=new Person(65,100);
		a[1]=new Person(70,150);
		a[2]=new Person(56,90);
		a[3]=new Person(75,190);
		a[4]=new Person(60,95);
		a[5]=new Person(68,110);
		System.out.println(getAns(a,6));
	
	}
	public static Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
	public static int getAns(Person[] a,int n){
		int max=0;
		for(int i=0;i<n;i++){
			int temp=getMaxOf(i,a,n);
			if(max<temp) max=temp;
		}
		return max;
	}
	public static int getMaxOf(int i,Person[] a,int n){
			if(ht.containsKey(i)) return ht.get(i);
			int max=1;
			for(int j=0;j<n;j++){
				int temp=0;
				if(top(i,j,a)) temp=getMaxOf(j,a,n);
				if(temp+1>max){
					max=temp+1;
				}
			}
			ht.put(i,max);
			return max;
	}
	public static boolean top(int i,int j,Person[]a){
		if(a[i].height<a[j].height&&a[i].weight<a[j].weight) return true;
		return false;
	}

} 

class Person{
	Person(int a,int b){
		height=a;
		weight=b;
	}
	int height;
	int weight;
}
