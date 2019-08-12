#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char c[50];
  scanf("%s",&c);
  int i=0;
  printf("String in uppercase is ");
  while(c[i])
  {
    putchar(toupper(c[i]));
    i++;
  }
}