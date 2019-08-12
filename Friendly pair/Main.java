#include<stdio.h>
int main()
{
  //Fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int sum_a=0;
  int sum_b=0;
  for(int i=1;i<a;i++)
  {
    if(a%i==0)
      sum_a+=i;
  }
  for(int i=1;i<b;i++)
  {
    if(b%i==0)
      sum_b+=i;
  }
  if((sum_a/a)==(sum_b/b))
    printf("Friendly Pair");
  else
    printf("Not Friendly Pair");
}