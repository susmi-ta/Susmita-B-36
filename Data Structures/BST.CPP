//Implementation of BST
#include<stdio.h>
#include<stdlib.h>
struct node{
    int info;
    struct node *left,*right;
}*root=NULL;

void find(int item,struct node **par,struct node **loc)
{
    struct node *ptr,*ptrsave;
    if(root==NULL)
    {
        *loc=NULL;
        *par=NULL;
        return;
    }
    if(item==root->info)
    {
        *par=NULL;
        *loc=root;
        return;
    }
    if(item<root->info)
        ptr=root->left;
    else
        ptr=root->right;
    ptrsave=root;
    while(ptr!=NULL)
    {
        if(item==ptr->info)
        {
            *loc=ptr;
            *par=ptrsave;
            return;
        }
        ptrsave=ptr;
        if(item<ptr->info)
        ptr=ptr->left;
        else
        ptr=ptr->right;
    }
    *loc=NULL;
    *par=ptrsave;
}
void insert(int item)
{
    struct node *tmp,*par,*loc;
    find(item,&par,&loc);
    tmp=(struct node *)malloc(sizeof(struct node));
    tmp->info=item;
    tmp->left=NULL;
    tmp->right=NULL;
    if(par==NULL)
        root=tmp;
    else
    {
        if(item<par->info)
        par->left=tmp;
        else
        par->right=tmp;
    }
}
void inorder(struct node *r)
{
    if(r!=NULL)
    {
        inorder(r->left);
        printf("%4d",r->info);
        inorder(r->right);
    }
    
}
void case_a(struct node *par,struct node *loc)
{
    if(par==NULL)
    root=NULL;
    else
    {
        if(loc==par->left)
        par->left=NULL;
        else
        par->right=NULL;
    }
}
void case_b(struct node *par,struct node *loc)
{
    struct node *child;
    if(loc->left!=NULL)
    child=loc->left;
    else
    child=loc->right;
    if(loc==par->left)
    par->left=child;
    else
    par->right=child;
}
void case_c(struct node *par,struct node *loc)
{
    struct node *ptr,*ptrsave,*suc,*parsuc;
    ptrsave=loc;
    ptr=loc->right;
    while(ptr->left!=NULL)
    {
        ptrsave=ptr;
        ptr=ptr->left;
    }
    
}
void del(int item)
{
    struct node *par,*loc;
    if(root==NULL)
    {
        printf("\n Tree is empty");
        return;
    }
    find(item,&par,&loc);
    if(loc==NULL)
    {
        printf("\n Item is not present in the tree");
        return;
    }
    if(loc->left==NULL && loc->right==NULL)
    {
        case_a(par,loc);
    }
    else if(loc->left!=NULL && loc->right==NULL)
    {
        case_b(par,loc);
    }
    else if(loc->left==NULL && loc->right!=NULL)
    {
            case_b(par,loc);
    }
    else if(loc->left!=NULL && loc->right!=NULL)
    {
            case_c(par,loc);
    }
}
int main()
{
    int ch,n;
    char ans;
    while(1)
    {
        printf("\n 1....INSERT");
        printf("\n 2....DISPLAY");
        printf("\n 3....DELETE");
        printf("\n 0....EXIT");
        printf("\n Enter ur choice :");
        scanf("%d",&ch);
        switch(ch)
        {
            case 0: exit(0); break;
            case 1:     do{
                        printf("\n Enter a no:");
                        scanf("%d",&n);
                        insert(n);
                        fflush(stdin);
                        printf("\n Press y to cont...");
                        scanf("%c",&ans);
                        }while(ans=='y');
                        break;
            case 2: inorder(root); break;
            case 3: printf("\n Enter the del item:");
                    scanf("%d",&n);
                    del(n);
                    break;
                    
        }
    }
return 0;
}