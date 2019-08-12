#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char c[50];
  scanf("%s",&c);
  int i=0;
  printf("String with lowercase is ");
  while(c[i])
  {
    putchar(tolower(c[i]));
    i++;
  }
}