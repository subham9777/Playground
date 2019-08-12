#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int last = a%10;
  int first = a/10;
  printf("%d",first+last);
}