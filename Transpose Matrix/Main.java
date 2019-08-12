#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n][n];
  int b[n][n];
 for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
      b[j][i] = a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    if(i>=1)
    printf("\n");
    for(int j=0;j<n;j++)
    {
      printf("%d ",a[i][j]);
    }
  }
  printf("\nTranspose matrix is :");
  for(int i=0;i<n;i++)
  {
    printf("\n");
    for(int j=0;j<n;j++)
    {
      printf("%d ",b[i][j]);
    }
  }
}