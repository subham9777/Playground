#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[50],b[50];
  scanf("%s",&a);
  strcpy(b,a);
  printf("The copied string is %s.",b);
}