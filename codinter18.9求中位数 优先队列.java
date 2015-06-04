import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
    public static PriorityQueue <Integer>q1=
			new PriorityQueue<Integer>(10, new myComparator());
	public static PriorityQueue <Integer>q2=new PriorityQueue<Integer>();
	public static void main  (String argc[] ){
		while(true){
			System.out.println( getMedian( sc.nextInt() ) );		
		}
	}
	public static double getMedian(int num){
		
		if(q1.isEmpty()||q1.peek()>=num){
			q1.add(num);
		}
		else q2.add(num);
		if(q1.size()>q2.size()+1){
			int tmp=q1.poll();
			q2.add(tmp);
		}
		else if(q1.size()<q2.size()){
			int tmp=q2.poll();
			q1.add(tmp);
		}
		if(q1.size()==q2.size()) return (q1.peek()*1.0+q2.peek())/2;
		else return q1.peek();
	}	
}
class myComparator implements Comparator<Integer>{
	public int compare(Integer a,Integer b){
		return b-a;
	}
}
