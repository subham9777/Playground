#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int d = a>b?a:b;
  int e = b>c?b:c;
  int f = d>e?d:e;
  printf("%d is greater",f);
}