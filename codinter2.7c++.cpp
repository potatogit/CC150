#include <cstdio>
#include <cstdlib>
#include <stack.h>
using namespace std;

typedef struct node{
  int data;
  struct node * next;
} node;

typedef struct linkedlist
{
	node *head;
}linkedlist;

int check(linkedlist l){
	node *f,*s;
	f=s=l.head;
	stack <int> st;
	while(f!=NULL&&f->next!=NULL){
		f=f->next->next;
		st.push(s->data);
		s=s->next;
	}
	if(f!=NULL)
	{
		s=s->next;
	
	}
	while(s!=NULL)
	{
		if(st.top()!=s->data) return 0;
		st.pop();
		s=s->next;
	}
	return 1;
	
}

int main(){
	
	linkedlist l;
	l.head=(node *)malloc(sizeof(node));
	l.head->data=1;
	l.head->next=NULL;
	node *p=l.head,*temp;
	for(int i=2;i<5;i++)
	{
		temp=(node *)malloc(sizeof(node));
		temp->data=i;
		temp->next=NULL;
		p->next=temp;
		p=temp;
	}
	for(int i=5;i>1;i--)
	{
		temp=(node *)malloc(sizeof(node));
		temp->data=i;
		temp->next=NULL;
		p->next=temp;
		p=temp;
	}
	cout<<check(l);
	
}
