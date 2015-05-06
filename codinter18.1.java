import java.util.*;
public class Main {
	public static void main(String argc[]){
		System.out.println(add(123,543));
	}
	public static int add(int a,int b){
		if(b==0) return a;
		int addition=a^b;//余位
		int carry=(a&b)<<1;//进位
	    return add(addition,carry);	
	}
}
