import java.util.*;

public class CodInter {
	public static void main(String argc[]){
		Scanner cin=new Scanner(System.in);
		int num=cin.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++){
			a[i]=cin.nextInt();
		}
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");	
		}
		System.out.println();
		mergeSort(0,num-1,a);
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void mergeSort(int start,int end,int [] a){
		if(start==end) return;
		int middle=(start+end)/2;
		mergeSort(start,middle,a);
		mergeSort(middle+1,end,a);
		combine(start,end,a);
	}
	public static void combine(int start,int end,int[]a){
		int helper[]=new int[a.length];//
		for(int count=start;count<=end;count++){
			helper[count]=a[count];
		}
		int mid=(start+end)/2;
		int j=mid+1;
		int i=start;
		int c=start;
        while(i<=mid&&j<=end){
        	if(helper[i]<=helper[j])
        		a[c++]=helper[i++];
        	else{
        		a[c++]=helper[j++];
        	}
        }
        while(i<=mid)
        	a[c++]=helper[i++];
        while(j<=end)
        	a[c++]=helper[j++];
	}
}
