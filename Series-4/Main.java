#include<stdio.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  int num[n];
  int c=3;
  num[0]=0;
  for(int i=1;i<n;i++)
  {
    num[i] = num[i-1]+c;
    c=c+2;
  }
  printf("Enter n value\n");
  for(int i=0;i<n;i++)
  {
    printf("%d ",num[i]);
  }
}