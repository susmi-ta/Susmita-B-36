//single linklist full implementation:-
#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node *add;
} *start = NULL;

void create(){
    struct node *p, *q;
    int n;
    printf("enter a number\n");
    scanf("%d", &n);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = n;
    p->add = NULL;
    if (start == NULL){
	start = p;
    }
    else{
	q = start;
	while (q->add != NULL){
	    q = q->add;
	}
	q->add = p;
    }
}

void ins_at_first(){
    struct node *p;
    int n;
    printf("enter a number\n");
    scanf("%d", &n);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = n;
    p->add = start;
    start = p;
}

void ins_at_last(){
    struct node *p, *q;
    int n;
    printf("enter a number\n");
    scanf("%d", &n);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = n;
    p->add = NULL;
    q = start;
    while (q->add != NULL){
	q = q->add;
    }
    q->add = p;
}
void ins_at_any_pos(){
    struct node *p, *q, *r;
    int n;
    int i = 0;
    int pos;
    printf("enter the position\n");
    scanf("%d", &pos);
    printf("enter a number\n");
    scanf("%d", &n);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = n;
    q = start;
    while (q != NULL){
	i++;
	if (i == pos){
	    r->add = p;
	    p->add = q;
	    break;
	}
	r = q;
	q = q->add;
    }
}

void del_at_first(){
    struct node *p;
    p = start;
    start = start->add;
    free(p);
}

void del_at_last(){
    struct node *p, *q;
    p = start;
    while (p->add != NULL){
	q = p;
	p = p->add;
    }
    q->add = NULL;
    free(p);
}

void del_at_any_pos(){
    struct node *p, *q;
    int pos, m = 0;
    printf("enter position \n");
    scanf("%d", &pos);
    p = start;
    while (p != NULL){
	m++;
	if (m == pos){
	    q->add = p->add;
	    free(p);
	    break;
	}
	q = p;
	p = p->add;
    }
}
void count(){
    struct node *p;
    p = start;
    int c = 0;
    while (p != NULL){
	c++;
	p = p->add;
    }
    printf("%d\n", c);
}

void sort(){
    struct node *p, *q;
    p = start;
    int r;
    while (p != NULL){
	q = p->add;
	while (q != NULL){
	    if (p->data > q->data){
		r = p->data;
		p->data = q->data;
		q->data = r;
	    }
	    q = q->add;
	}
	p = p->add;
    }
}
void search(){
    struct node *p;
    p = start;
    int n, m = 0;
    printf("enter the number you are looking for\n");
    scanf("%d", &n);
    while (p != NULL){
	if (p->data == n){
	    m = 1;
	    break;
	}
	p = p->add;
    }
    if (m == 1){
	printf("found\n");
    }
    else{
	printf("not found\n");
    }
}

void display(){
    struct node *p;
    p = start;
    while (p != NULL){
	printf("%d ", p->data);
	p = p->add;
    }
    printf("\n");
}

int main(){
    int ch;
    clrscr();
    while (1){
	printf("enter 1 for create\n");
	printf("enter 2 for ins_at_first\n");
	printf("enter 3 for ins_at_last\n");
	printf("enter 4 for ins_at_any_pos\n");
	printf("enter 5 for del_at_first\n");
	printf("enter 6 for del_at_last\n");
	printf("enter 7 for del_at_any_pos\n");
	printf("enter 8 for count\n");
	printf("enter 9 for sort\n");
	printf("enter 10 for search\n");
	printf("enter 11 for display\n");
	printf("enter 12 for exit\n");
	scanf("%d", &ch);
	switch (ch){
		case 1:
			create();
			break;
		case 2:
			ins_at_first();
			break;
		case 3:
			ins_at_last();
			break;
		case 4:
			ins_at_any_pos();
			break;
		case 5:
			del_at_first();
			break;
		case 6:
			del_at_last();
			break;
		case 7:
			del_at_any_pos();
			break;
		case 8:
			count();
			break;
		case 9:
			sort();
			break;
		case 10:
			search();
			break;
		case 11:
			display();
			break;
		case 12:
			exit(0);
		default:
			printf("wrong input\n");
			break;
	}
    }
    return 0;
    getch();
}