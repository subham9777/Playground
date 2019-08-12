#include<stdio.h>
int main()
{
  //Type your code here
  int n,i;
  scanf("%d",&n);
  int s[n];
  s[0] = 0;
  s[1] = 1;
  for(i=2;i<n;i++)
  {
    s[i] = s[i-2] + s[i-1];
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",s[i]);
  }
  return 0;
}