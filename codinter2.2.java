import java.util.*;

public class Stringtest
{
	public static class node //main函数是静态函数，只能调用静态类和静态方法
	{public
		int data;
		node next;
	}
	
	
	public static int lastkth(int k,node h)
	{
		node p=null,n=h;
		int countk=0;
		while(n!=null){
			if(countk==k){
				p=h;
			}
			if(p!=null){
				p=p.next;
			}
			n=n.next;
			countk++;
		}
//		for(int i=0;i<=k-1;i++)
//			 n=n.next;
//		p=h;
//		while(n!=null){
//			n=n.next;
//			p=p.next;
//		}
		if (p==null) return -1000;
		return p.data;
	}
	
	public static void main(String [] argc)
	{
		node l=new node();
		node p=l;
		for(int i=1;i<10;i++){
			for(int j=0;j<i;j++){
				node temp=new node();
				temp.data=j;
				temp.next=null;
				p.next=temp;
				p=p.next;				
			}
		}
		
		p=l.next;
		while(p!=null){
			System.out.print(p.data);
			p=p.next;
		}
		
		Scanner cin=new Scanner(System.in);
		int k=cin.nextInt();
		System.out.println(lastkth(k,l.next));
	
		
		
	}
}
