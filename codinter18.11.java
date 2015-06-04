import java.util.*;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {	
		int matrix[][]= new int [3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix[i][j]=0;
			}
		}
		matrix[0][0]=1;
		matrix[0][2]=1;
		matrix[1][2]=1;
		matrix[2][2]=1;
		Square s=seekSquare(matrix);
		System.out.println(s.x+" "+s.y+" "+s.size);
	} 
	public static Square seekSquare(int matrix[][]){ //white=1,black=0;
		int n=matrix.length;
		int zeror[][]=new int[n][n],zerob[][]=new int[n][n];
		for(int i=0;i<n;i++){
			int ii=n-i-1;
			for(int j=0;j<n;j++){
				int jj=n-j-1;
				if(jj==n-1) {
					if (matrix[ii][jj]==0) 
					  zeror[ii][jj]=1;
					else 
					  zeror[ii][jj]=0;
					if (matrix[jj][ii]==0) 
						  zerob[jj][ii]=1;
					else 
					      zerob[jj][ii]=0;
				}
				else{
					if(matrix[ii][jj]==0){
						zeror[ii][jj]=zeror[ii][jj+1]+1;
					}
					else{
						zeror[ii][jj]=0;
					}
					if(matrix[jj][ii]==0){
						zerob[jj][ii]=zerob[jj+1][ii]+1;
					}
					else{
						zerob[jj][ii]=0;
					}
					
				}
			}
		}
		
		for(int size=n;size>=1;size--){
			int count=n-size+1;
			for(int i=0;i<count;i++){
				for(int j=0;j<count;j++){
					if(zerob[i][j]>=size&&zerob[i][j+size-1]>=size&&
							zeror[i][j]>=size&&zeror[i+size-1][j]>=size)
						return new Square(i,j,size);
				}
			}
		}
		return null;
	}
}
class Square{
	int x,y,size;
	public Square(int a,int b, int c){
		x=a;
		y=b;
		size=c;
	}
}
