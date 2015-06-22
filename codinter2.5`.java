import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
	public static void main (String argc[] ){
		int a1[]={6,5,2},a2[]={5,3,5,5,6};
		node p1=insert(a1);
		node p2=insert(a2);
		print(plus(p1,p2));
	}
	public static node plus(node m1,node m2){
		node p1=m1,p2=m2,sumhead=new node(),p=sumhead;
		int t=0;
		while(p1!=null||p2!=null||t!=0){
			int s1=0,s2=0;
			if (p1!=null)
			     s1=p1.data;
			if(p2!=null)
				s2=p2.data;
			p.next=new node();
			p.next.data=(s1+s2+t)%10;
			t=(s1+s2+t)/10;
			p=p.next;
			if(p1!=null) p1=p1.next;
			if(p2!=null) p2=p2.next;
		}
		return sumhead.next;
	}
	public static node insert(int a[]){
		node head=new node(),p=head;
		for(int i=0;i<a.length;i++){
			p.next=new node();
			p.next.data=a[i];
			p=p.next;
		}
		return head.next;
	}
	public static void print(node n){
		while(n!=null){
			System.out.print(n.data);
			n=n.next;
		}
		System.out.println();
	}
}
class node{
	int data;
	node next;
}