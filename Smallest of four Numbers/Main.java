#include<stdio.h>

int main()
{
  // Type your code here
  int a[4],i,j,temp;
  for(i=0;i<4;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<4;i++)
  {
    for(j=0;j<(4-i-1);j++)
    {
      if(a[j]>a[j+1])
      {
        temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
      }
    }
  }
  printf("%d",a[0]);
}