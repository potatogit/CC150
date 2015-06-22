import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
	public static void main  (String argc[] ){
		    char ch[]=new char[30];
		    char c[]={'m','r',' ','j','o','h','n',' ','s','m','i','t','h'};
		    for(int i=0;i<13;i++){
		    	   ch[i]=c[i];
		    }
		    change(ch,13);
			System.out.println(Arrays.toString(ch)  );		
	}
	public static void change(char [] ch,int len){
		int counts=0;
		for(int i=0;i<len;i++){
			if(ch[i]==' ') counts++;
		}
		counts+=counts;
		for(int i=len-1,j=counts+len-1;i>=0;i--){
			if(ch[i]!=' ') {
				ch[j--]=ch[i];
			}
			else{
				ch[j--]='0';
				ch[j--]='2';
				ch[j--]='%';
			}
		}
	}
}