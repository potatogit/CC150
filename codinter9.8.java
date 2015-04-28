import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
       Scanner cin=new Scanner(System.in);
       while(true){
    	   int n=cin.nextInt();
    	   count=0;
    	   getAns(n,4);
           System.out.println(count);
       }
       
	}
	public static int count;
	public static void getAns(int n,int flag){//flag用来保证无序性，如果有序应该去掉flag参数
		if(n==0){
			count++;
			return;
		}
		if(n>=25&&flag==4) getAns(n-25,4);
		if(n>=10&&flag>=3) getAns(n-10,3);
		if(n>=5&&flag>=2) getAns(n-5,2);
		if(n>=1&&flag>=1) getAns(n-1,1);
	}
} 
