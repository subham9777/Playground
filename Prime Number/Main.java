#include<stdio.h>
int prime(int num,int i);
int main()
{
  //fill your code
  int n,check;
  scanf("%d",&n);
  check = prime(n,n/2);
  if(check==1)
    printf("%d is a prime number",n);
  else
    printf("%d is not a prime number",n);
}
int prime(int num,int i)
{
  if(i==1)
    return 1;
  else
  {
    if(num%i==0)
      return 0;
    else
      return prime(num,i-1);
  }
}