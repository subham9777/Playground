#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int count=0,i;
  gets(str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
      count=count+1;
  }
  printf("%d",count+1);
}