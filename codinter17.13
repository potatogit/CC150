import java.util.*;
public class Main {
	public static void main(String argc[]){
		Binode r=null;
		int a[]={4,234,423,34,1,23,5,6,7,8};
		for(int i=0;i<a.length;i++){
			if(i==0) r=new Binode(a[i]);
			else r.build(a[i],r);
		}
		r.print1(r);
		changeA(r);
		r.print2(r);
	}
	public static void changeA(Binode root){
		Binode a=change(root);
		a.b1.b2=null;
		a.b1=null;
	}
	public static Binode change(Binode root){
		if(root==null) return null;
		Binode left=change(root.b1);
		Binode right=change(root.b2);
		//注意right可能为空
	    Binode rightTail=right==null?null:right.b1;
		
		if(left==null&&right==null)
		{
			root.b1=root.b2=root;return root;
		}
        //把左边与root连接
		if(left==null){
			connect(right.b1,root);
		}
		else{
			connect(left.b1,root);
		}
		//把root和右边连接
		if(right==null){
			connect(root,left);
		}
		else{
			connect(root,right);
		}
		//如果左右都不空，则把右边和左边连接
		if(left!=null&&right!=null){
		    connect(rightTail,left);	
		}	
        return left==null?root:left;
	}
	public static void connect(Binode l,Binode r){
		l.b2=r;
		r.b1=l;
	}
}
class Binode{
	int data;
	Binode b1;
	Binode b2;
	void print1(Binode r){
		if(r==null) return;
		System.out.print(r.data+" ");
	    print1(r.b1);
		print1(r.b2);
	}
	void print2(Binode r){
		if(r==null) return;
		System.out.print(r.data+" ");
		print2(r.b2);
	}
	Binode(int a){
		this.data=a;
	}
	void build(int a,Binode r){
		if(r==null){
			r=new Binode(a);
			return;
		}
		if(a>r.data){
			if(r.b2==null)
			   r.b2=new Binode(a);
			else build(a,r.b2);
			return;
		}
		if(a<=r.data){
			if(r.b1==null)
			r.b1=new Binode(a);
			else build(a,r.b1);
			return;
		}
	}
}
