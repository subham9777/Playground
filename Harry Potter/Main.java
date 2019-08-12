#include<stdio.h>
int main()
{
  //fill your code
  int a,first;
  scanf("%d",&a);
  int last = a%10;
  while(a>=10)
  {
    a = a/10;
    first = a;
  }
  printf("%d",first+last);
}