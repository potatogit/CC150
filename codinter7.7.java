import java.util.*;

public class CodeInterview {
	public static void main (String []argc){
		Scanner cin=new Scanner(System.in);
		while(true){
			int k=cin.nextInt();
			int ans=get_kth(k);
			System.out.println(ans);
		}
		
	}
	public static int get_kth(int k){
		int ans=0,i;
		Queue <Integer> q3=new LinkedList <Integer> () ;
		Queue <Integer> q5=new LinkedList <Integer> () ;
		Queue <Integer> q7=new LinkedList <Integer> () ;//想定义一个数组，数组的元素是队列，是实现不了的
		q3.offer(3);//入队
		q5.offer(5);
		q7.offer(7);
		for(i=0;i<k;i++){
			ans=deleteAdd(q3,q5,q7);			
		}
		return ans;
	}
	public static int deleteAdd(Queue<Integer> q3,Queue<Integer> q5,Queue<Integer> q7){
		int which,head3,head5,head7;
		head3=q3.peek();
		head5=q5.peek();
		head7=q7.peek();
		which=Math.min(Math.min(head3, head5),head7);
		if(which==head3){
			q3.poll();//出队
			q3.offer(which*3);
			q5.offer(which*5);
			q7.offer(which*7);
		}
		if(which==head5){
			q5.poll();//出队
			q5.offer(which*5);
			q7.offer(which*7);
		}
		if(which==head7){
			q7.poll();//出队
			q7.offer(which*7);
		}		
		return which;
	}

}
