#include<stdio.h>
int sum(int i);
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  printf("%d",sum(n));
  return 0;
}
int sum(int i)
{
  if(i!=0)
  	return i + sum(i-1);
  else
    return i;
}