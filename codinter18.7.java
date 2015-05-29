import java.util.*;
public class Main implements Comparator{
	static Scanner cin=new Scanner(System.in);	
	public static void main(String argc[]){	
		String arr[]={"test", "tester", "testertest", "testing", 
	            "apple", "seattle", "banana",  "batting", "ngcat", 
	            "batti","bat", "testingtester", "testbattingcat"};
		System.out.println(getAns(arr));
	}
	public static String getAns(String [] arr){
		Hashtable <String,Boolean> ht=new Hashtable<String,Boolean>();
		for(String s:arr){
			if(!ht.containsKey(s)) ht.put(s,true);
		}
		Arrays.sort(arr,new Main());
		for(String s:arr){
			if (madeOfWords(s,false,ht)) return s;
		}
		return null;
	}
	//boolean b为false时表示当前字符串s是String数组中的，true表示的是s是中间过程中的某个字串
	//hashtable同时用来缓存不能由别的单词组成的中间子串
	public static boolean madeOfWords(String s,boolean b,Hashtable <String,Boolean> ht){
		if(ht.containsKey(s)&&b) return ht.get(s);//
		for(int i=0;i<s.length();i++){
			String sub=s.substring(0,i);
			if(ht.containsKey(sub)&&ht.get(sub)&&madeOfWords(s.substring(i),true,ht)){
				return true;
			}			
		}
		if(b) ht.put(s,false);
		return false;
	}
	//重载comparator接口中的compare方法
	public int compare(Object o1,Object o2){//自定义按长度比较字符串
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()>s2.length()?-1:(s1.length()==s2.length()?0:1);
	}
}
