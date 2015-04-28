import java.util.*;
//java.lang.String str="";

public class Stringtest
{
   public static void main(String[] argc)
   {
	   Scanner cin=new Scanner(System.in);
	   while(true)
	  {
		java.lang.String str=cin.next();
		str=change(str);
		System.out.println(str);
		  

	  }
	  
   }
   
   public static java.lang.String change(java.lang.String s)
   {
	   java.lang.String ss="";
	   int len=s.length(),count=0;
	   char temp=' ';
	   for (int i=0;i<len;i++)
	   {
		   if(count==0) {temp=s.charAt(i);count++;}
		   else{
			   if(s.charAt(i-1)==s.charAt(i)) 
			   {
				   count++;
			   }
			   else{
				   ss=ss+temp+count;
				   count=1;
				   temp=s.charAt(i);
			   }
		   }
		   
	   }
	   ss=ss+temp+count;
	   if(ss.length()<len) return ss;
	   else return s;
	   
   }
}
