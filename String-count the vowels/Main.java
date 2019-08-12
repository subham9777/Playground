#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[50];
  scanf("%s",&a);
  int count=0;
  for(int i=0;i<strlen(a);i++)
  {
    int b=a[i];
    if(b==97 || b==101 || b==105)
      count+=1;
  }
  printf("Number of vowels: %d",count);
}