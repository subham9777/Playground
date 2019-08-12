#include<stdio.h>
int dec_bin(int a);
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  printf("%d",dec_bin(n));
}
int dec_bin(int a)
{
  if(a==0)
    return 0;
  else
    return(a%2 + 10*dec_bin(a/2));
}