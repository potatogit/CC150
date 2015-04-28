import java.util.*;

public class CodeInterview {
	public static void main(String [] argc){
		
	}
	
	public class CallHandler{//singleton method 本类采用单例模式
		private static CallHandler instance=null;
		private final int LEVELS=3;
		
		private final int NUM_RESPONDENTS=10;
		private final int NUM_MANAGERS=4;
		private final int NUM_DIRECTORS=2;
		
		List <List<Employee>> employeeLevels;//二维数组？
		List <List<Call>> callQueues;
		
		protected CallHandler(){}
		
		public static CallHandler getInstance(){
			if(instance == null) instance=new CallHandler();
			return instance;
		}
		
		public Employee getHandlerForCall(Call call){}
		
		public void dispatchCall(Caller caller){
			Call call=new Call(caller);//为新接入电话的消费者建立一个对象
			dispatchCall(call);//为这个对象找到合适服务人员
		}
        public void dispatchCall(Call call){
			Employee emp=getHandlerForCall(call);
			if(emp!=null){
				emp.receiveCall(call);
				call.setHandler(emp);
			}
			else{
				call.reply("Please wait for free employee to reply!");
				callQueues.get(call.getRank().getValue()).add(call);//?????
			
			}
		}
        public boolean assignCall(Employee emp){};				
	}
	
	public class Call{
		private Rank rank;
		private Caller caller;
		private Employee handler;
		public Call (Caller c){
			rank=Rank.Responder;
			caller=c;
		}
		public void setHandler(Employee e){
			handler=e;
		}
		public void setRank(Rank r){rank=r;}
		public Rank getRank(){return rank;}
		public Rank incrementRank(){}
		public void disconnect(){}
		public void reply(String s){
			System.out.println(s);
		}
	}
	
	abstract class Employee{
		private Call currentCall=null;
		protected Rank rank;
		public Employee(){}
		public void receiveCall(Call call){}
		public void escalateAndReassign(){}
		public boolean assignNewCall(){}
		public boolean isFree(){}
		public Rank getRank(return rank;)
	}
	
	class Director extends Employee{
		public Director(){
			rank=Rank.Director;
		}		
	}
	class Manager extends Employee{
		public Manager(){
			rank=Rank.Manager;
		}	
	}
	class Respondent extends Employee{
		public Respondent(){
			rank=Rank.Respondent;
		}	
	}
	
	public class Rank{
		
	}
	public class Caller{
		
	}
}

