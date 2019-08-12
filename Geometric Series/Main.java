#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,i,even,odd,c1=0,c2=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    if(i%2==0)
    {
      even = pow(2,c1);
      c1= c1+1;
    }
    else if(i%2!=0)
    {
      odd = pow(3,c2);
      c2 = c2+1;
    }
  }
  if(n%2==0)
    printf("%d",odd);
  else
    printf("%d",even);
  return 0;
}