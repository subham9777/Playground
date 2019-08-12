#include<stdio.h>
int main()
{
  //Fill your code
  int a;
  scanf("%d",&a);
  int b[a];
  b[0] = 1;
  b[1] = 2;
  for(int i=2;i<a;i++)
  {
    b[i] = b[i-2]+b[i-1];
  }
  printf("Enter n value\n");
  for(int i=0;i<a;i++)
  {
    printf("%d ",b[i]);
  }
}