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
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i][j]!=0)
        flag=0;
      else
        flag=1;
    }
  }
  if(flag==0)
    printf("Lower triangular matrix");
}