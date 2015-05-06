import java.util.*;

public class CodInter {
	public static void main(String argr[]){
		Scanner cin=new Scanner (System.in);
		int num=cin.nextInt(),a[]=new int[num];
		for(int i=0;i<num;i++){
			a[i]=cin.nextInt();
		}
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		quickSort(0,num-1,a);
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");
		}	
	}
	public static void quickSort(int start,int end,int a[]){
		if(start>=end) return;
		int key=a[end];
		int i=start,j=end;
		while(i<j){//这里很容易弄错
			while(i<j&&a[i]<=key)
				i++;
			if(i<j)
				a[j--]=a[i];
			while(i<j&&a[j]>key)
				j--;
			if(i<j)
				a[i++]=a[j];
		}
		a[i]=key;
		quickSort(start,i-1,a);
		quickSort(i+1,end,a);
	}
}
