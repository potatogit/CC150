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
		node h=l;
		node pre=h;
		node p=l.next;
		while(h.next!=null){
			while(p!=null){
				if(p.data==h.data){
					pre.next=p.next;
					p=pre.next;
				}
				else{
					pre=p;
					p=p.next;				
				}
					
			}
			h=h.next;	
			pre=h;
			p=pre.next;
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


   
