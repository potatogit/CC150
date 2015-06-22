import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
	public static void main (String argc[] ){
	}
	public static void delete(node m){
		if(m.next==null) return ;
		node tp=m.next;
		m.data=tp.data;
		m.next=tp.next;
	}
}
class node{
	int data;
	node next;
}