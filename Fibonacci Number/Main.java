#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int num = 5*n*n+4;
  float s = sqrt(num);
  if(s*s==(float)num)
    printf("Fibonacci Number");
  else
    printf("Not Fibonacci Number");
}