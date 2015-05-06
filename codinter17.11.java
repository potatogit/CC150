import java.util.*;
public class Main {
	public static void main(String argc[]){
	}
	public static int rand7(){
		while(true){
			int num=rand5()*2,num01=rand5()%2,random=num+num01;
			if(random<7) return random;
		}		
	}
}
