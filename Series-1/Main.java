#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int b[a];
  b[0] = 7;
  for(int i=1;i<a;i++)
  {
    if(i%2==0)
      b[i] = b[i-1]+3;
    else
      b[i] = b[i-1]-2;
  }
  for(int i=0;i<a;i++)
  {
    printf("%d ",b[i]);
  }
}