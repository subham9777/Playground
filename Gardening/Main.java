#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d %d %d",&c,&b,&a);
  if(a>5 && a<=10 || a>15 && a<=20)
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");
}