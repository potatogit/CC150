import java.util.*;
//java.lang.String str="";

public class Stringtest
{
   public static void main(String [] argc)
   {
	   Scanner cin=new Scanner(System.in);
	   int m=cin.nextInt();
	   int n=cin.nextInt();
	   int a[][]=new int[m][n];
	   for(int i=0;i<m;i++)
		   for (int j=0;j<n;j++)
			   a[i][j]=cin.nextInt();
	   a=change(a,m,n);
	   for(int i=0;i<m;i++)
	   {
		   for (int j=0;j<n;j++)
		   {
			   System.out.print(a[i][j]);
			   System.out.print(' ');
			}
		   System.out.print("\n");
	   }
   }
   public static int[][] change(int [][]a,int m,int n)
   {
	   boolean flag[][]=new boolean[m][n];
	   for(int i=0;i<m;i++)
		   for (int j=0;j<n;j++)
			   flag[i][j]=false;
	   for(int i=0;i<m;i++)
		   for (int j=0;j<n;j++)
		   {
			   if(!flag[i][j]&&a[i][j]==0)
			   {
				   for(int temp=0;temp<m;temp++) {a[temp][j]=0;flag[temp][j]=true;}
				   for(int temp=0;temp<n;temp++) {a[i][temp]=0;flag[i][temp]=true;}
				   
				}
		   }
	   return a;
   }
   
}
   
