#include<stdio.h>
int main()
{
  //fill your code
  int m,n;
  scanf("%d %d",&m,&n);
  int a[m][n];
  int b[m][n];
  int sum=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
    for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
    for(int i=0;i<m;i++)
  {
      if(i==1)
        printf("\n");
    for(int j=0;j<n;j++)
    {
      sum = a[i][j] + b[i][j];
      printf("%d ",sum);
    }
  }
}