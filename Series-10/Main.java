#include<stdio.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  a[0] = 0;
  int c=2;
  for(int i=1;i<n;i++)
  {
    a[i] = a[i-1] + c;
    c+=2;
  }
  printf("Enter n value\n");
  for(int i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
}