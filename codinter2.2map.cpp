#include <cstdio>
#include <cstdlib>
#include <map>

using namespace std;

typedef struct node
{
    int data;
    struct node * next;

}node ;

typedef struct linkedlist
{
    node *head;

}linkedlist;

void dupdelete(linkedlist  l)//用map构造哈希表
{
    map<int,bool>table;
    node * pre=l.head;
    node * p=pre->next;
    map<int,bool>::iterator it;
    while(p!=NULL)
    {
        it=table.find(p->data);
        if(it==table.end()){
         table.insert(pair <int,bool>(p->data,true));
         pre=p;
         p=p->next;
        }
        else{
        pre->next=p->next;
        p=p->next;
        }

    }
}

int main()
{
   linkedlist l;//思考:如何create一个链表？
   l.head=(node *)malloc(sizeof(node));
   l.head->next=NULL;
   node *p=l.head;//两个空指针之间互相赋值是没有意义的，因此要为head指针初始化申请空间
   for (int i=1;i<10;i++)
    {
        for(int j=0;j<i;j++)
        {
            node *temp=(node*)malloc(sizeof(struct node));
            temp->data=j;
            temp->next=NULL;
            p->next=temp;
            p=p->next;
        }

    }
      p=l.head->next;
    while(p!=NULL)
    {
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
    printf("\n");
    dupdelete(l);
    p=l.head->next;
    while(p!=NULL)
    {
        printf("%d ",p->data);
        p=p->next;
    }
    getchar();
    getchar();

}
