import java.util.*;
public class Main {
	public static void main(String argc[]){
		Scanner cin=new Scanner(System.in);		
		while(true){
			int i=cin.nextInt();
			System.out.println(getAns(i,2));
		}
	}
	public static int getAns(int o,int m){
		int count=0,mask=1,temp=o;
		while(temp!=0){
			int a=o/mask/10;//取高位的数
			int bit=temp%10;//取本位的数字
			if(bit>m){
				count+=(a+1)*mask;
			}
			if(bit==m){
				count+=a*mask+o%mask+1;//o%mask为低位的数
			}
			if(bit<m){
				count+=a*mask;
			}
			mask*=10;
			temp/=10;
		}
		return count;
	}
}
//25
//9
//123
