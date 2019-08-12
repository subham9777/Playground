#include<stdio.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  a[0]=2;
  int c=2;
  for(int i=1;i<n;i++)
  {
    if(i==2)
      c=c+1;
    else if(i==3)
      c = c+2;
    else if(i==4)
      c = 9;
    a[i] = a[i-1]+c;
    
  }
  for(int i=0;i<n;i++)
    printf("%d ",a[i]);
}