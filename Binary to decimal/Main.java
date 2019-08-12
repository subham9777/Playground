#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int sum=0;
  int i=0;
  while(n>0)
  {
    int rem = n%10;
    int power = pow(2,i);
    sum  = sum + (rem*power);
    i=i+1;
    n=n/10;
  }
  printf("%d",sum);
  return 0;
}