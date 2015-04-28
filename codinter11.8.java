import java.util.*;
public class Main {
	public static Node root=null;
	public static void main(String argc[]){	
		for(int i=9;i>=0;i--)
		{
			if(root==null)	root=new Node(i);
			else root.insert(i);
		}
		System.out.println(getRank(8,0,root)+" "+getRank(5,0,root));
	}
	public static int getRank(int num,int counter,Node root){
		if(num==root.num) return root.nlc+counter+1;
		if(num<root.num) return getRank(num,counter,root.left);
		counter+=root.nlc+1;
		return getRank(num,counter,root.right);
	}	
} 
class Node{//建树的操作一定都要在树的类里面完成!!!如插入,可以递归也可以不用递归直接用while
	int num,nlc;//number of left child 左子树的节点数,没赋初值则默认为0
	Node left;
	Node right;	
	Node (int n){
		num=n;
	}
	void insert(int nn){
		if(nn>num){
			if(right!=null)
				right.insert(nn);
			else
				right=new Node(nn);			
		}
		else{
			if(left!=null)
				left.insert(nn);
			else
				left=new Node(nn);
			nlc++;
		}
	}
}
