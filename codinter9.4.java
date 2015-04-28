import java.util.*;

public class CodInter {
	public static void main(String[] argc) {
		ArrayList<Integer> set = new ArrayList<Integer>();
		for(int i=0;i<5;i++){
			set.add(i);
		}
		ArrayList <ArrayList<Integer>> ans=f(set);
		for(ArrayList<Integer> subSet:ans){
    		print(subSet);
    	}
	}
	
	public static void print(ArrayList<Integer> subSet){
		for(int i:subSet){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
    public static ArrayList<ArrayList<Integer>> f(ArrayList<Integer> set){
    	ArrayList<ArrayList<Integer>> subSets =new ArrayList<ArrayList<Integer>>();
    	subSets.add(new ArrayList<Integer>());
    	return getAns(subSets,set,0);
    }
	public static ArrayList <ArrayList<Integer>> getAns(ArrayList<ArrayList<Integer>> subSets,ArrayList<Integer> set,int no){   	
    	ArrayList<ArrayList<Integer>> ans=subSets;
    	int item=set.get(no);
    	ArrayList<ArrayList<Integer>> newSubSets=new ArrayList<ArrayList<Integer>>();
    	for(ArrayList<Integer> subSet:subSets){
    		ArrayList<Integer> newSub=new ArrayList<Integer>();
    		newSub.addAll(subSet);//将subSet中的所有元素加到newSub中
    		newSub.add(item);
    		newSubSets.add(newSub);//不能在循环体内将newSub直接加到subSets里，因为越加subSets项越多，会无限循环
    	}
    	subSets.addAll(newSubSets);
    	if(no+1<set.size()){
    		ans=getAns(subSets,set,no+1);
    	}
    	return ans; 	
    }
} 
