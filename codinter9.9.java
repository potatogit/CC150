import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
		for(int b=0;b<8;b++){
			 ArrayList <Point> al=new ArrayList <Point> ();
        	 boolean row [] =new boolean [8];
        	 boolean column[] =new boolean [8];
        	 boolean dial1[] =new boolean [15];
        	 boolean dial2[] =new boolean [15];
        	 eightQueens(0,b,al,row,column,dial1,dial2);       	
		}    
		// System.out.println(count);
	}
	//public static int count=0;
    public static void eightQueens(int i,int j,ArrayList <Point> al,boolean row[],boolean column [],boolean dial1[],boolean dial2[]){
    	if(!row[i]&&!column[j]&&!dial1[i+j]&&!dial2[i-j+7]){	
    		if(i==7){//注意此语句的位置
    			print(al);
    			return;
    		}
    		al.add(new Point(i,j));
    		row[i]=true;column[j]=true;dial1[i+j]=true;dial2[i-j+7]=true;
    		for(int b=0;b<8;b++){
    			eightQueens(i+1,b,al,row,column,dial1,dial2);
    		}
    		row[i]=false;//因为方法中数组等对象的参数传递都是引用传递，而基本类型（int，string，char，etc）都是值传递，所以数组需要手动改回原值，int则不需要。（那arraylist是什么鬼呢？）
    		column[j]=false;
    		dial1[i+j]=false;
    		dial2[i-j+7]=false;
    		//al.remove(al.size()-1);
    	}
    }  

    public static void print(ArrayList <Point> al){
    	for(Point p:al){
    		System.out.print("("+p.x+","+p.y+")"+"  ");
    	}
    	System.out.println();
    	//count++;
    }
} 
class Point{
	int x;
	int y;
	public Point(int a,int b){
		x=a;y=b;
	}
}
