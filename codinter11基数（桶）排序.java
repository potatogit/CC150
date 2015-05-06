import java.util.*;
//分别按照每一位进行排序
public class CodInter {
	public static void main(String argc[]){
		Scanner cin=new Scanner (System.in);
		int num=cin.nextInt(),a[]=new int[num];
		for(int i=0;i<num;i++){
			a[i]=cin.nextInt();
		}
        countingSort(a,num);
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void countingSort(int a[],int n){
		for(int i=1;i<4;i++){
			bitCount(i,a,n);
		}
	}
    public static void bitCount(int b,int a[],int n){
    	int helper[]=new int[n],divider=1;
    	for(int i=1;i<b;i++){
    		divider*=10;
    	}
    	for(int i=0;i<n;i++){//分别取个十百位的数字
    		helper[i]=a[i]/divider%10;
    	}
    	for(int i=0;i<n;i++){
    		for(int j=i+1;j<n;j++){
    			if(helper[j]<helper[i]){
    				int temp=helper[j];
    				helper[j]=helper[i];
    				helper[i]=temp;
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
    }
}
