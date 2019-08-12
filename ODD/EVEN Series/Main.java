#include<stdio.h>
int main()
{
	//type your code here
  int n,i;
  scanf("%d",&n);
  int s[n];
  s[0]=0;
  s[1] = 0;
  for(i=2;i<n;i++)
  {
    if(i%2==1)
    {
      s[i] = s[i-2]+ 1;
    }
    else if(i%2==0)
    {
      s[i] = s[i-2] + 2;
    }
  }
  	printf("%d ",s[n-1]);
}