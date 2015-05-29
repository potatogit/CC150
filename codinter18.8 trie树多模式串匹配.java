import java.util.*;
public class Main{
	static Scanner cin=new Scanner(System.in);	
	public static void main(String argc[]){	
		String str="bibs";
		String arr[]={ "apple","b", "ib","bis","bs"};
		find(str,arr);
	}
	public static void find(String goal,String model[]){
		TrieNode root=new TrieNode();
		for(int i=0;i<goal.length();i++){
			root.insert(i,goal.substring(i));
		}
		for(int i=0;i<model.length;i++){
			ArrayList <Integer> indexes=root.search(model[i]);
			print(indexes);
		}
	}
	public static void print(ArrayList <Integer> indexes){
		if(indexes!=null)
		     for(int a:indexes)
			    System.out.print(a+" ");
		System.out.println();
	}
}

class TrieNode{
	char ch;
	Hashtable<Character,TrieNode> ht=new Hashtable<Character,TrieNode>();
	ArrayList <Integer> indexes=new ArrayList <Integer>();
	public void insert(int index,String str){
		indexes.add(index);
		if(str==null||str.length()==0) return;		
		char c=str.charAt(0);
		if(ht.containsKey(c)) 
			ht.get(c).insert(index,str.substring(1));
		else{ 
			TrieNode child=new TrieNode();
			ht.put(c,child);
			child.insert(index,str.substring(1));
		}
	}
	//由于建trie树时，每个子串由一个空节点结尾，所以查找至str长度为0时结束
	public ArrayList <Integer> search(String str){
		if(str.length()==0) return indexes;
		if(ht.containsKey(str.charAt(0)))
			return ht.get(str.charAt(0)).search(str.substring(1));
		return null;		
	}
}
