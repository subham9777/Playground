#include<stdio.h>
#include<limits.h>
int main()
{
  int m,n;
  int sum=0;
  scanf("%d %d",&m,&n);
  int a[m][n];
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
      if(i==0||j==0||i==n-1||j==n-1)
      {
        sum = sum + a[i][j];
      }
      else
        continue;
    }
  }
  printf("Sum of boundaries is %d",sum);
 
}
