#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int c = a%4==0?printf("%d is a leap year",a):printf("%d is not a leap year",a);
}