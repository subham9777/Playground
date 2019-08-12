#include<stdio.h>
int main()
{
  //fill your code
  int n,m,sum=0;
  scanf("%d %d",&n,&m);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    sum+=a[i];
  }
  float bus = ceil((float)sum/(float)m);
  printf("%.2f",bus);
}