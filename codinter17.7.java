import java.util.*;
public class Main {
	public static void main(String argc[]){
		Scanner cin= new Scanner (System.in);
		while(true){
			int num=cin.nextInt();
		    System.out.println(getAnswer(num));
		}
	}
	public static String getAnswer(int num){
		String ans="";
		if(num>=1000000){
			ans=ans+howManyMillion(num/1000000);
			num%=1000000;
		}	
		if(num>=1000){
			ans=ans+howManyThousand(num/1000);
			num%=1000;
		}		
		if(num>=100){
			ans=ans+howManyHundred(num/100);
			num%=100;
		}	
		if(num>=20){
			ans=ans+howManyTen(num);
			num%=10;
		}
		else{
			if(num>=10){
				ans=ans+howMany11(num);
				return ans;
			}
		}
		if(num>0)ans+=howMany1(num);			
		return ans;	
	}
	public static String howManyMillion(int num){
        return getAnswer(num)+"million ";
	}
	public static String howManyThousand(int num){
        return getAnswer(num)+"thousand ";
	}
	public static String howManyHundred(int num){
        return getAnswer(num)+"hundred ";
	}
	public static String howManyTen(int num){
        String str[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		return str[num/10-2]+" ";
	}
	public static String howMany1(int num){
	    String str[]={"one","two","three","four","five","six","seven","eight","nine"};
		return str[num-1]+" ";
	}
	public static String howMany11(int num){
        String str[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		return str[num-10]+" ";
	}
}
//仅限正数
//10044
//TEN THOUSAND FORTY FOUR 
//1434300
//ONE MILLION FOUR HUNDRED THIRTY FOUR THOUSAND THREE HUNDRED 
