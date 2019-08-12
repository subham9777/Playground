#include<stdio.h>
int main()
{
  //Fill your code
  int a,n;
  scanf("%d %d",&a,&n);
  for(int i=1;i<=n;i++)
  {
    printf("%d * %d = %d\n",a,i,(a*i));
  }
}