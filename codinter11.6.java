import java.util.*;
public class Main {
	public static void main(String argc[]){	
		int a[][]={{1,2,8},{8,8,12},{20,22,24}};
		searchMatrix(a,3,3,8);
	}
	public static void searchMatrix(int a[][],int m,int n,int toFind){
		for(int i=0;i<m;i++){
			if(binarySearch(a,i,0,n-1,toFind)){
				break;
			}
		}
	}
	public static boolean binarySearch(int a[][],int i,int start,int end,int toFind){
		if(start>end) return false;
		int mid=(start+end)/2;
		if(a[i][mid]==toFind){
			System.out.println(i+" "+mid);
			return true;
		}
		if(binarySearch(a,i,start,mid-1,toFind)){
			return true;
		}
		if(binarySearch(a,i,mid+1,end,toFind)){
			return true;
		}
		return false;
	}

} 

