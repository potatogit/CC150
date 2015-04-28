import java.util.*;

public class Stringtest
{
	public static class node //main函数是静态函数，只能调用静态类和静态方法
	{public
		int data;
		node next;
	}
	
	public static node partition(node h,int x){
		
		node head =new node();//node head;只是创建了一个引用，未为其分配空间，new。。。之后才分配空间，开可以直接为其赋值
		head.next=h;
		node p=h,pre=head;
		if(p.data<x){  //第一个节点需要单独考虑，如果data小于x，pre、p指针需要前进，否则会出现无限循环。
			pre=p;p=p.next;
		}
		while(p!=null){
			if(p.data<x){
				pre.next=p.next;
				p.next=head.next;
				head.next=p;
				p=pre.next;
			}
			else{pre=p;p=p.next;}
			
		}
		
	    return head.next;	
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

		p=partition(l.next,5);
		
		System.out.println();
	
		
		while(p!=null){
			System.out.print(p.data);
			p=p.next;
		}
		
	}
}
