#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a=n;
  int sum=0;
  while(a!=0)
  {
    int rem = a%10;
    sum = sum + pow(rem,3);
    a=a/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not Armstrong Number");
}