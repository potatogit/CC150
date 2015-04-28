#include <cstdio>
#include <cstdlib>
#include <iostream> 
#include <stack.h>
#define inf 9999999
using namespace std;

typedef struct stackitem{
	int data;
	int min;
} stackitem;

class newstack :public stack<stackitem>{//c++用冒号表示继承 
public :
	void push(int n){
		stackitem * temp=(stackitem*)malloc(sizeof(stackitem));
		temp->data=n;
		temp->min=n<this->getmin()?n:this->getmin();//this！！！指针！！！ 
		stack<stackitem>::push(*temp);//调用父类同名函数 并且《stackitem》 
	}
	int getmin(){
		if (this->empty()) return inf;
		else return this->top().min;
	}
};//类的最后也要加分号！！！！！ 

int main(int argc, char *argv[])
{
	//stack<int> ss;
	//ss.push(123);
	newstack s;//c++不用new！！！ 
	for(int i=10;i>0;i--) s.push(i);
	cout<<s.getmin()<<endl;
	s.pop();
	s.pop();
    cout<<s.getmin()<<endl;
    //cout<<ss.top()<<endl;
	return 0;
} 
