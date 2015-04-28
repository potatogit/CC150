import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
          ArrayList<String> al=getPermutations("big");
          print(al);
	}
	
	public static void print(ArrayList<String> al){
		for(String s:al){
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> getPermutations(String s){
		if(s.length()==1){
			ArrayList <String> permutations=new ArrayList <String>();
			permutations.add(s);
			return permutations;
		}
		ArrayList <String> permutations=getPermutations(s.substring(0,s.length()-1));
		char c=s.charAt(s.length()-1);
		ArrayList <String> newPermutations=new ArrayList <String>();
		for(String every:permutations){
			for(int i=0;i<=every.length();i++){
				String newString=insert(c,every,i);//
				newPermutations.add(newString);
			}
		}	
		return newPermutations;
	}
	
	public static String insert(char c,String every,int i){
		return every.substring(0,i)+c+every.substring(i);//substring（0,0）返回空串，substring（0,length）返回原串，substring（length）返回空串，
	}
	/*例如：
         String s = “Test”;
         String s1 = s.substring(2);
                           则该代码的作用是取字符串s中索引值为2(包括)以后的所有字符作为子串，则字符串s1的值是”st”。
                           如果数字的值和字符串的长度相同，则返回空字符串。例如：
         String s = “Test”;
         String s1 = s.substring(4);
                           则字符串s1的值是””。
                           如果需要取字符串内部的一部分，则可以使用带2个参数的substring方法，例如：
         String s = “TestString”;
         String s1 = s.substring(2,5);
                           则该代码的作用是取字符串s中从索引值2(包括)开始，到索引值5(不包括)的部分作为子串，则字符串s1的值是”stS”。*/
} 
