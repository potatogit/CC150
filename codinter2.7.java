import java.util.*;

public class Stringtest
{
   public static class node{ //主方法中引用的类得是静态类
   int data;
   node next;
   }
   public static void main (String [] argc){
   node h=new node(),p=h;
   h.data=1;
   h.next=null;
  
   for(int i=2;i<5;i++){
       node temp= new node();
       temp.data=i;
       temp.next=null;
       p.next=temp;
       p=temp;
      }
   for(int i=4;i>0;i--){
	   node temp= new node();
       temp.data=i;
       temp.next=null;
       p.next=temp;
       p=temp;
      }
    System.out.println(check(h));

   }
   public static int check(node h){
     node fast=h,slow=h;
     Stack<Integer> stack=new Stack<Integer>();
     
     while(fast!=null&&fast.next!=null){
       stack.push(slow.data);
       slow=slow.next;
       fast=fast.next.next;
       }
     
     if(fast!=null){
      slow=slow.next;
      }
   
     while(slow!=null){
      if (slow.data!=stack.peek())
                return 0;
      stack.pop();
      slow=slow.next; 
      }
     
     return 1;
  }
   
}
