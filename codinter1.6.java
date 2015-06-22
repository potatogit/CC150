import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
	public static void main  (String argc[] ){
		int arr[][]=new int [4][4],c=1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arr[i][j]=c++;
			}
		}
		rotate(arr);
		for(int i=0;i<4;i++)
		     System.out.println(Arrays.toString(arr[i]));
	}
	public static void rotate(int arr[][]){
		int n=arr.length-1;
		for(int l=0;l<arr.length/2;l++)
			for(int i=l;i<n-l;i++){
				int tmp=arr[l][i];
				arr[l][i]=arr[n-i][l];
				arr[n-i][ l ]=arr[n-l][n-i];
				
				arr[n-l][n-i]=arr[ i ][ n-l ];
				arr[i][n-l]=tmp;
			}
	}
}
