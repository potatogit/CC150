import java.util.*;

public class CodeInterview {
	
	public static void main(String argc[]){
		Scanner cin=new Scanner(System.in);
		ArrayList <Point> points=new ArrayList <Point>() ;
		int n=cin.nextInt(),i,j;
		Line bestLine=null;
		int most=0;
		for(i=0;i<n;i++){
			int x,y;
			x=cin.nextInt();
			y=cin.nextInt();
			Point temp=new Point(x,y);
			points.add(temp);
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				Line line=comebineSpots(points.get(i),points.get(j));
				int tempCount=howManySpots(points,i,line);
				if(tempCount>most){
					bestLine=line;
					most=tempCount;
				}				
			}
		}
		
		System.out.println("line: y="+bestLine.k+"x+"+bestLine.b +" no. of spots is:"+most);
	}
	
   public static class Point{		
		int x,y;	
		Point(int a,int b){
			x=a;
			y=b;
		}
	}
   public static class Line{
	   double k,b;
	   Boolean isVertical;
   }
   public static Line comebineSpots(Point o1,Point o2){
	   Line line=new Line();
	   if(o1.x==o2.x){
		   line.isVertical=true;
		   line.b=o1.x;
		   return line;
	   }
	   line.isVertical=false;
	   line.k=(o1.y-o2.y)*1.0/(o1.x-o2.x);
	   line.b=o1.y-line.k*o1.x;
	   return line;	   
	   
   }
   public static int howManySpots(ArrayList <Point> points,int i, Line line){
	   int count=0;
	   for(int ii=0;ii<i;ii++){
		   Point p=points.get(ii);
		   if(isExisted(p,line)) count++;
	   }
	   return count+2;
   }
   public static Boolean isExisted(Point p,Line line){
	   if(!line.isVertical)
	        return Math.abs(p.x*line.k+line.b-p.y)<0.001?true:false;
	   return Math.abs(p.x-line.b)<0.001?true:false;
   }
}
