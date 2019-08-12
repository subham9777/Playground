#include<stdio.h>
int main()
{
  //type your code here
  int n;
  scanf("%d",&n);
  int num[30];
  int i=0;
  while(n>0)
  {
    num[i] = n%8;
    n=n/8;
    i=i+1;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",num[j]);
  }
  return 0;
}