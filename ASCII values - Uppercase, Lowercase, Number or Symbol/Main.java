#include<stdio.h>
int main()
{
  //Fill your code
  char a;
  scanf("%c",&a);
  int b = a;
  if(b>=65 && b<=90)
    printf("Upper");
  else if(b>=97 && b<=122)
    printf("Lower");
  else if(b>=48 && b<=57)
    printf("Number");
  else
    printf("Symbol");
}