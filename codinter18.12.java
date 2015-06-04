import java.util.*;
public class Main {
	public static int rowl,rowr,colu,cold,tmpl,tmpr;
	public static void main (String argc[] ){
		int arr[][]={{9,-8,1,3,-2},{-3,7,6,-2,4},{6,-4,-4,8,-7}};
		int max=getMaxOfMatrix(arr);
		System.out.println(max);
	}
	public static int getMaxOfMatrix(int arr[][]){
		int max=0;
		int sumarr[][]=getSumArr(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int rowsum[]=getSumOfCol(i,j,sumarr);
				int tmp=getMaxOfRow(rowsum);
				if(tmp>max){
					colu=i;
					cold=j;
					max=tmp;
				}
			}
		}
		return max;
	}
	public static int  [][] getSumArr(int arr[][] ){
		int ans[][]=new int [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			if(i==0){
				for(int j=0;j<arr[0].length;j++){
					ans[i][j]=arr[i][j];
				}
			}
			else{
			  for(int j=0;j<arr[0].length;j++){
				 ans[i][j]=arr[i][j]+ans[i-1][j];
			  }
			}
		 }
		return ans;
	}
	public static int [] getSumOfCol(int a,int b,int sumarr[][]){
		if(a==0) return sumarr[b];
		int ans[]=new int [sumarr[0].length];
		for(int i=0;i<sumarr[0].length;i++){
			ans[i]=sumarr[b][i]-sumarr[a-1][i];
		}
		return ans;
	}
	public static int getMaxOfRow(int arr[]){
		int max=0,tmpsum=0,tmpl=0,tmpr=0;
		for(int i=0,j=0;i<arr.length;i++){
			tmpsum+=arr[i];
			if(tmpsum>max){
				tmpr=i;
				tmpl=j;
				max=tmpsum;
			}
			if(tmpsum<0){
				j=i+1;
				tmpsum=0;
			}
		}
		return max;
	}
}
