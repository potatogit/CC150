import java.util.*;

public class Stringtest
{
	public static class node //main函数是静态函数，只能调用静态类和静态方法
	{public
		int data;
		node next;
	}
	
	public static void dupdelete(node l)
	{
		Hashtable<Integer, Boolean> table=new Hashtable<Integer,Boolean>();//<Key,Value>
		node p=l;
		table.put(p.data, true);
		node n=p.next;
		while(n!=null){
			if(table.containsKey(n.data)){
				p.next=n.next;
				n=n.next;
			}
			else{
				table.put(n.data, true);
				p=n;
				n=n.next;
			}
		}
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
		
		dupdelete(l.next);
		System.out.print("\n");
		p=l.next;
		while(p!=null){
			System.out.print(p.data);
			p=p.next;
		}
		
	}
}
