#include<stdio.h>
int main()
{
  //Fill your code
  int a;
  scanf("%d",&a);
  int reverse=0;
  int b=a;
  while(a!=0)
  {
    reverse = reverse*10;
    reverse = reverse+(a%10);
    a=a/10;
  }
  if(reverse==b)
    printf("Same");
  else
    printf("Not Same");
}