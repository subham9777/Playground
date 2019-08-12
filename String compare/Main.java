#include<stdio.h>
int main()
{
  //fill your code
  char a[50],b[50];
  scanf("%s %s",&a,&b);
  int result = strcmp(a,b);
  if(result==0)
    printf("Strings are same");
  else
    printf("Strings are not same");
}