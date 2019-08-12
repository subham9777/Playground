#include<stdio.h>
int main()
{
  //fill your code
  int m,n,max=0;
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
      if(a[i][j]>max)
        max = a[i][j];
    }
    printf("%d\n",max);
    max=0;
  }
}