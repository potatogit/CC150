import java.util.*;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {	
		String[] words = {"maps", "tan", "tree", "apple", "cans", "help", "aped", "free", "apes", "flat", "trap", "fret", "trip", "trie", "frat", "fril"};
		HashSet<String> dict = new HashSet<String>();
		for(String s:words){
			dict.add(s);
		}
		ArrayList<String> list = getAns("tree", "flat", dict);
		for (String word : list) {
			System.out.println(word);
		}
	}
	public static  ArrayList <String> getAns(String st,String en,
			HashSet<String>wordDict){
		HashMap <String, String> backtrack=new HashMap<String,String> ();
		Queue <String> q=new LinkedList<String> ();
		HashSet <String>Visited=new HashSet <String> ();
		q.add(st);
		Visited.add(st);
		while(!q.isEmpty()){
			String now=q.poll();
			ArrayList <String> oneEditedWords=getoew(now,wordDict);
			for(String s:oneEditedWords){
				if(s.equals(en)){  //不能用==来判断字符串是否相等
					ArrayList <String> ans=new ArrayList<String> ();
					ans.add(s);
					backtrack.put(s,now);
					String fr=s;
					while(backtrack.get(fr)!=null){  //
						fr=backtrack.get(fr);
						ans.add(0,fr);
					}
					return ans;
				}
				else{
					if(!Visited.contains(s)){
						q.add(s);
						Visited.add(s);
						backtrack.put(s,now);
					}
				}
			}
		}
		return null;
	}
	public static ArrayList <String> getoew(String now,HashSet<String> wordDict){
		char chArray[]=now.toCharArray();
		ArrayList <String> al=new ArrayList<String> ();
		for(int i=0;i<now.length();i++){
			for(char ch='a';ch<='z';ch++){
				chArray[i]=ch;
				String str=new String(chArray);
				if(ch!=now.charAt(i)&&wordDict.contains(str)){
					al.add(str);
				}
				chArray[i]=now.charAt(i);
			}
		}
		return al;
	}
}
