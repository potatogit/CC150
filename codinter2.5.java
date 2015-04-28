import java.util.*;

public class Stringtest
{
	public static class node //main函数是静态函数，只能调用静态类和静态方法
	{public
		int data;
		node next;
	}
	
	public static node add(node n1,node n2){
		node p1=n1,p2=n2;
		while(p1!=null&&p2!=null){
			p1.data+=p2.data;
			if(p1.data>=10)
			{
				if(p1.next!=null){
					p1.data-=10;
					p1.next.data+=1;
				}
				else{
					p1.data-=10;
					node n=new node();
					n.next=null;
					n.data=1;
					p1.next=n;
				}
			}
			p1=p1.next;
			p2=p2.next;
		}
		if(p1==null){
			p1=p2;return n1;
		}
		else{
			while(p1!=null){
				if(p1.data>=10){
					if(p1.next!=null){
						p1.data-=10;
						p1.next.data+=1;
					}
					else{
						p1.data-=10;
						node n=new node();
						n.next=null;
						n.data=1;
						p1.next=n;
					}
				}
				else{return n1;}
			}
		}
		return n1;
			
		
	}
	
	public static void main(String [] argc)
	{
		node l=new node();
		node p=l;
		for(int i=1;i<10;i++){
				node temp=new node();
				temp.data=i;
				temp.next=null;
				p.next=temp;
				p=p.next;				
		}
		
		node m=new node();
		p=m;
		for(int i=1;i<10;i++){
			node temp=new node();
			temp.data=i;
			temp.next=null;
			p.next=temp;
			p=p.next;				
	}
		
		
		p=m.next;
		while(p!=null){
			System.out.print(p.data);
			p=p.next;
		}

        node ans=add(l.next,m.next);
		
		System.out.println();
	    
		p=ans;		
		while(p!=null){
			System.out.print(p.data);
			p=p.next;
		}
		
	}
}
