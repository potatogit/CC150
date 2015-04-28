import java.util.*;
public class Main {
	public static void main(String argc[]){
		int a[]={1,2,4,10,8,2,12,6,7,3,19};		
		getAnswer(a,11);
	}
	public static void getAnswer(int a[],int n){	
		int min=1<<30,max=-1<<30,flag2=0,flag1=0,mm=0,nn=0;
		for(int i=1;i<n;i++){
			if(a[i-1]>a[i]) flag1=1;
			if(flag1==1&&a[i]<min) {
				min=a[i];
				nn=i;
			}
		}
		for(int i=0;i<n;i++){
			if(a[i]>min){
				mm=i;
				break;
			}
		}
		for(int i=n-2;i>=0;i--){
			if(a[i]>a[i+1]) flag2=0;
			if(flag2==0&&a[i]>max){
				max=a[i];
				if(i<mm) mm=i;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(a[i]<max&&i>nn){
				nn=i;
				break;
			}
		}	
		System.out.println(mm+","+nn);
	}
}
