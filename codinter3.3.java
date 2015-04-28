import java.util.*;

class Stringtest{
	public static class SetofStacks{
		ArrayList <Stack<Integer>> superstack=new ArrayList <Stack<Integer>>() ;//莫忘初始化
		int camp=5;
		void push (int n){
			if(superstack.size()==0||superstack.get(superstack.size()-1).size()==camp){//
				Stack<Integer> temp=new Stack<Integer>();
				temp.push(n);
				superstack.add(temp);
			}
			else{
				superstack.get(superstack.size()-1).push(n);
			}
		}
		
		int pop(){
			Stack<Integer> laststack=superstack.get(superstack.size()-1);
			int value=laststack.pop();
			if(laststack.isEmpty()==true){
				superstack.remove(superstack.size()-1);
			}
			return value;
		}
		
	}
	
	public static void main(String [] argc){
		SetofStacks a=new SetofStacks();
		for(int i=1;i<11;i++)
		   a.push(i);
		for(int i=1;i<11;i++)
		{System.out.println(a.pop());}
	}
}
