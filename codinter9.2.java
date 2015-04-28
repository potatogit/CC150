import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
		Scanner cin=new Scanner(System.in);
		int x=cin.nextInt();
		int y=cin.nextInt();
		System.out.println(getAns(x,y));
	}
    static int a[][] = new int[1000][1000];
    public static int getAns(int x,int y){
    	if(a[x][y]!=0) return a[x][y];
    	if(x==0&&y==0) return a[x][y]=0;
    	if(x==0&&y==1) return a[x][y]=1;
    	if(x==1&&y==0) return a[x][y]=1;   	
    	if(x==0) a[x][y]=getAns(x,y-1);
    	if(y==0) a[x][y]=getAns(x-1,y);
    	if(x!=0&&y!=0) a[x][y]=getAns(x-1,y)+getAns(x,y-1);
    	return a[x][y];   	
    }	
} 
