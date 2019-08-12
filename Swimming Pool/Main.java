#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int c = (a*a*a*1000)>b?printf("Can store"):printf("Cannot store");
}