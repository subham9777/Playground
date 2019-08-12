#include<stdio.h>
int main()
{
  //fill your code
  int m,n,greater=0;
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
      if(a[j][i]>=greater)
      	greater = a[j][i];
    }
    printf("%d\n",greater);
    greater=0;
  }
  
}