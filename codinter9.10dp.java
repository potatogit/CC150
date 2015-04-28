import java.util.*;

public class CodInter {
	public static Hashtable <Integer,ArrayList<Box>> ht=new Hashtable<Integer,ArrayList<Box>>();
	public static void main(String[] argc) {
		Box[] boxes = { new Box(5, 4, 8),new Box(7, 8, 3),new Box(7, 8, 1)};
		ArrayList <Box> ans=createStack(boxes,-1);
		System.out.println(heightOf(ans));
		}    
	public static ArrayList <Box> createStack(Box box[],int bottom){
		if(ht.containsKey(bottom)){
			return ht.get(bottom);
		}
		ArrayList <Box> al=new ArrayList <Box>();
		int maxHeight=0;
		ArrayList <Box> maxStack=new ArrayList<Box>();
		for(int i=0;i<box.length;i++){
			if(canBeAbove(bottom,i,box)){
				ArrayList<Box> tempStack=createStack(box,i);
				int temp=heightOf(tempStack);
				if (temp>maxHeight){
					maxHeight=temp;
					maxStack=tempStack;
				}
			}
		}
		if(bottom!=-1){
			al.add(box[bottom]);
			al.addAll(maxStack);
			ht.put(bottom,al);
		}
		else{
			al.addAll(maxStack);
			//ht.put(bottom,al);
		}
		return al;
	}
	
	public static boolean canBeAbove(int bo,int i,Box[]box){
		if(bo==-1) return true;
		if(box[bo].depth>box[i].depth&&box[bo].width>box[i].width&&box[bo].height>box[i].height){
			return true;
		}
		return false;
	}
	public static int heightOf(ArrayList <Box> stack){
		int h=0;
		for(Box box:stack){
			h+=box.height;
		}
		return h;
	}
} 

class Box{
	int depth;int height;int width;
	public Box(int w,int h,int d){
		depth=d;height=h;width=w;
	}
}
