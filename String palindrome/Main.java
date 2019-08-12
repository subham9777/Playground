#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[50];
  scanf("%s",&a);
  char b[50];
  int flag=0;
  int len = strlen(a);
  for(int i=0;i<len;i++)
  {
    if(a[i]!=a[i-len-1])
    {
      flag=1;
      break;
    }
  }
  if(!flag)
    printf("Palindrome");
  printf("Palindrome");
}