#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int d = a<b?a:b;
  int e = b<c?b:c;
  int f = d>e?d:e;
  printf("The treasure is in the box which has number %d.\n",f);
  printf("The code to open the box is %d.",a);
}