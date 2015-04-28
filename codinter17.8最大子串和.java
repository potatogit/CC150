import java.util.*;
public class Main {
	public static void main(String argc[]){
		int a[]={2,4,5,-12,10,-3,-2,8};		
		System.out.println(getAnswer(a,8));
	}
	public static int getAnswer(int a[],int n){	
		int max=0,curSum=0;
		for(int i=0;i<n;i++){
			curSum+=a[i];
			if(curSum>max) max=curSum;
			if(curSum<0)   curSum=a[i];		
		}
		return max;
	}
}
