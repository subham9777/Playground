#include<stdio.h>
int main()
{
  //fill your code
  char a[50],b[50];
  scanf("%s %s",&a,&b);
  strcat(a,b);
  printf("The concatenated string is %s",a);
}