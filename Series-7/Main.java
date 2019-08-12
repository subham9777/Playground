#include<stdio.h>
int main()
{
  //Fill your code
  int a;
  scanf("%d",&a);
  int b[a];
  b[0]=10;
  b[1]=5;
  for(int i=2;i<a;i++)
  {
    if(i%2==0)
      b[i] = b[i-2]+50;
    else
      b[i] = b[i-2]+10;
  }
  printf("Enter n value\n");
  for(int i=0;i<a;i++)
  {
    printf("%d ",b[i]);
  }
}