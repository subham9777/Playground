#include<stdio.h>
#include<math.h>
int main()
{
  //Fill your code
  int a;
  scanf("%d",&a);
  int b[a];
  int c=2;
  b[0]=1;
  for(int i=1;i<a;i++)
  {
    b[i] = pow(c,c);
    c=c+1;
  }
  printf("Enter n value\n");
  for(int i=0;i<a;i++)
  {
    printf("%d ",b[i]);
  }
}