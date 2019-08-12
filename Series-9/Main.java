#include<stdio.h>
#include<math.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  int a[n+1];
  a[0] = 0;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
      a[i] = pow(i,2);
    else
      a[i] = pow(i,3);
  }
  printf("Enter n value");
  for(int i=1;i<=n;i++)
  {
    printf("%d ",a[i]);
  }
}