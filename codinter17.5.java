import java.util.*;
public class Main {
	public static void main(String argc[]){
			while(true){
				Scanner cin=new Scanner(System.in);
				String a=cin.next(),b=cin.next();
				getAnswer(a,b);
			}
	}
	public static void getAnswer(String guess,String solution){	
		int mask[]= new int[100],hit=0,psyHit=0;
		for(int i=0;i<4;i++){
			char c=solution.charAt(i);
			mask[c-'a']++;
		}	
		for(int i=0;i<4;i++){
			char c=guess.charAt(i);
			if(c==solution.charAt(i)){
				mask[c-'a']--;
				hit++;
			}
		}
		for(int i=0;i<4;i++){
			char c=guess.charAt(i);
			if(c!=solution.charAt(i)&&mask[c-'a']>0){
				mask[c-'a']--;
				psyHit++;
			}
		}
		System.out.println("hits:"+hit+" psyhits:"+psyHit);
	}
}
