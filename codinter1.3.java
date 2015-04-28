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
		   
	   java.lang.String str1=cin.next();
	   java.lang.String str2=cin.next();
	   boolean answer=check(str1,str2);
	   if(answer) System.out.println("Yes");
	   else System.out.println("No");
		   
	  }
	  
   }
   
   public static boolean check(java.lang.String s1,java.lang.String s2)
   {
	   int []count=new int [300];
	   for (int i=0;i<300;i++)
		   count[i]=0;
	   int len1=s1.length();
	   int len2=s2.length();
	   if (len1!=len2) return false;
	   for(int i=0;i<len1;i++)
	   {
		   count[s1.charAt(i)-'a'+100]++;
		   
	   }
	   for(int i=0;i<len1;i++)
	   {
		   if(s2.charAt(i)-1<0) return false;
		   count[s2.charAt(i)-'a'+100]--;
		   
	   }
	   for(int i=0;i<300;i++)
	   {
		   if (count[i]!=0) return false;
		   
	   }
	   return true;
	   
   }
   
}
