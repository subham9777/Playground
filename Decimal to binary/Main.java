#include<stdio.h>
int main()
{
  //Type your code here
  int n,i=0,bin[30];
  scanf("%d",&n);
  while(n>0)
  {
    int rem = n%2;
    bin[i] = rem;
    i = i+1;
    n = n/2;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",bin[j]);
  }
  
  return 0;
}