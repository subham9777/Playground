#include<stdio.h>
int main()
{
  //fill your code
  int n,flag=0;
  scanf("%d",&n);
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(a[i][j]!=0)
        flag=0;
      else
        flag=1;
    }
  }
  if(flag==1)
    printf("Upper triangular matrix");
}