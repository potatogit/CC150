import java.util.*;
import java.io.*;
import java.lang.*;
//java.lang.String str="";

public class Stringtest
{
   public static void main(String[] argc)
   {
	   Scanner cin=new Scanner(System.in);
	   while(true)
	  {
		   
	   java.lang.String str=cin.next();
	   boolean answer=check(str);
	   if(!answer) System.out.println("Yes");
	   else System.out.println("No");
		   
	  }
	  
   }
   
   public static boolean check(java.lang.String s)
   {
	   int []count=new int [300];
	   for (int i=0;i<300;i++)
		   count[i]=0;
	   int len=s.length();
	   for(int i=0;i<len;i++)
	   {
		   count[s.charAt(i)-'a'+100]++;
		   if( count[s.charAt(i)-'a'+100]>1)
			   return false;	   
	   }
	   return true;
	   
   }
   
}
