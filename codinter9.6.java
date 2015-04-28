import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
       Scanner cin=new Scanner(System.in);
    	   int n=cin.nextInt();
    	   String s="";
    	   getAns(n,n,s);
    	   print(al);       
	}
	public static ArrayList<String> al=new ArrayList<String>();
	public static void print(ArrayList<String> al){
		for (String s:al){
			System.out.print(s+" ");
		}
	}
	public static void getAns(int l,int r,String s){
		if(l==0&&r==0){
			al.add(s);
			return;
		}
		if(l>0){
			String ss=s+"(";
			getAns(l-1,r,ss);
		}
		if(r>l){
			String sss=s+")";
			getAns(l,r-1,sss);
		}
	}
} 
