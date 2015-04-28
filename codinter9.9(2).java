import java.util.*;

public class CodInter {
	public static void main(String argc[]){
		ArrayList<Point> al=new ArrayList<Point>();
		boolean row[]=new boolean [8];
	    boolean column[]=new boolean [8];
	    boolean dial1[]=new boolean [15];
		boolean dial2[]=new boolean [15];
		getAns(-1,0,al,row,column,dial1,dial2);
	}
	
	public static void getAns(int i,int j,ArrayList<Point> al,boolean row[],boolean column[],boolean dial1[],boolean dial2[]){
		if(i!=-1){
			if(row[i]||column[j]||dial1[i-j+7]||dial2[i+j]) return;
		    al.add(new Point(i,j));
		    if(i==7){
			     print(al);
			     al.remove(al.size()-1);//!!!!!
			     return;
		    }
		    row[i]=true;
		    column[j]=true;
		    dial1[i-j+7]=true;
		    dial2[i+j]=true;
			for(int jj=0;jj<8;jj++){
                	getAns(i+1,jj,al,row,column,dial1,dial2);
			}	
		    row[i]=false;
		    column[j]=false;
		    dial1[i-j+7]=false;
		    dial2[i+j]=false;
		    al.remove(al.size()-1);
		}	
		else{
			for(int jj=0;jj<8;jj++){
				for(int temp=0;temp<8;temp++){
					row[temp]=false;
					column[temp]=false;
				}
                for(int temp=0;temp<14;temp++){
					dial1[temp]=false;
					dial2[temp]=false;
				}
				getAns(i+1,jj,al,row,column,dial1,dial2);
			}	
		}
	}
	public static void print(ArrayList<Point> al){
		for(Point p:al){
			System.out.print("("+p.x+","+p.y+")"+" ");			
		}
		System.out.println();
	}

}

class Point{
	int x;int y;
	Point(int a,int b){
		x=a;
		y=b;
	}
}
