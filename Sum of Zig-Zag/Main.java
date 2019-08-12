#include<stdio.h>
int main()
{
  //fill your code
  int m,n,sum=0;
  scanf("%d %d",&m,&n);
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    scanf("%d",&a[i][j]);
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j || i==0 || i==2)
        sum+=a[i][j];
    }
  }
  printf("Sum of Zig-Zag pattern is %d",sum);
}