import java.util.*;
public class Main {
	public static void main(String argc[]){
		char a[][]=new char[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]='o';
			}
		}
		switch(ticTac(a)){
		 case 0:
			 System.out.println("Player0 wins!");
			 break;
		 case 1:
			 System.out.println("Player1 wins!");
			 break;
		 case -1:
			 System.out.println("No one wins.");
			 break;
		}				
	}
	public static int ticTac(char a [][]){
		for(int i=0;i<3;i++){
			if(a[i][0]==a[i][1]&&a[i][1]==a[i][2])
				return a[i][0]=='o'?1:0;
			if(a[0][i]==a[1][i]&&a[1][i]==a[2][i])
				return a[i][0]=='o'?1:0;
		}
		if (a[0][0]==a[1][1]&&a[1][1]==a[2][2])
			return a[0][0]=='o'?1:0;
		if (a[2][0]==a[1][1]&&a[1][1]==a[0][2])
		    return a[2][0]=='o'?1:0;
		return -1;
	}
}
