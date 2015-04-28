#include <cstdio>
#include <cstdlib>
#include <iostream> 
#include <stack.h>
#include <vector.h>
using namespace std;

class SetofStacks{
public:
	vector <stack<int> > superstack;
	void push(int n){
		if(superstack.empty()||superstack.back().size()==5){
			stack <int>temp;
			temp.push(n);
			superstack.push_back(temp);
		}
		else{
			superstack.back().push(n);
		}
	}
	
	int pop(){
		int value=superstack.back().top();
		superstack.back().pop();
		if(superstack.back().empty()) superstack.pop_back();
		return value;
	}
};

int main()
{
	SetofStacks s;
	for(int i=0;i<10;i++)
	s.push(i);
	for(int i=0;i<10;i++)
	{
		cout<<s.pop()<<endl;
	}
}
