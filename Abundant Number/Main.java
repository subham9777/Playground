#include<stdio.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  int sum=0;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
      sum+=i;
  }
  if(sum>n)
    printf("Abundant Number");
  else
    printf("Not Abundant Number");
}