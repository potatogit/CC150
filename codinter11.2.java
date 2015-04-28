import java.util.*;

public class CodInter {
	public static void main(String argc[]){
		String[] a = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		stringSort(a);
		for(String s:a){
			System.out.print(s+" ");
		}
	}
	public static void stringSort(String [] a){
		Hashtable <String,LinkedList <String>> ht=new Hashtable <String,LinkedList <String>>();
		for(String str:a){
			String temp=sortChars(str);
			if(ht.containsKey(temp)){
				ht.get(temp).add(str);
			}
			else{
				LinkedList <String> ll=new LinkedList<String> ();
				ll.add(str);
				ht.put(temp,ll);
			}
		}
		int i=0;
		for(String temp:ht.keySet()){//遍历哈希表的每个key
		     for(String temps:ht.get(temp)){//遍历链表的每个节点
		    	 a[i++]=temps;
		     }
		}
	}
	public static String sortChars(String str){
		char ch[]=str.toCharArray();//将字符串变成字符数组
		Arrays.sort(ch);//数组排序方法
		//return ch.toString();不行的，toString返回的是“类名@该string的哈希值”
		return new String(ch);
	}
}
