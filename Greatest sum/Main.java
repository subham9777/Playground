#include<stdio.h>
int main()
{
  //fill your code
  int m,n,sum=0,max=0;
  scanf("%d %d",&m,&n);
  int a[m][n];
  int b[m];
  int c[m];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      scanf("%d",&a[i][j]);
  }
  printf("Sum of rows is ");
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum  = sum + a[i][j];
    }
    printf("%d ",sum);
    b[i] = sum;
    sum=0;
  }
  printf("\nRow 1 has maximum sum");
  printf("\nSum of columns is ");
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum  = sum + a[j][i];
    }
    printf("%d ",sum);
    b[i] = sum;
    sum=0;
  }
  printf("\nColumn 2 has maximum sum");
}