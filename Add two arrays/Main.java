#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n],b[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    scanf("%d",&b[i]);
  }
  for(int i=0;i<n;i++)
  {
    a[i] =a[i]+b[i];
    printf("%d ",a[i]);
  }
}