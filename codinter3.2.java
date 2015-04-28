import java.util.*;

class Stringtest{
	
	public static class stackitem{
		int data;
		int min;
	}
	
	public static class newstack extends Stack<stackitem>{	//static

		public void push(int n){
			stackitem temp=new stackitem();
		    temp.data=n; 
	        temp.min=n>this.getmin()?this.getmin():n;
			super.push(temp);
		}
		
		public int getmin(){
		if(super.empty()==true) return Integer.MAX_VALUE;//赋最大值意味着error
		return super.peek().min;
		}
	}
	public static void main(String[] argc){		
		newstack s=new newstack();
		for(int i=10;i>0;i--)
			s.push(i);
		
		System.out.println(s.getmin());	
		s.pop();
		s.pop();
		System.out.println(s.getmin());		
	}
}
