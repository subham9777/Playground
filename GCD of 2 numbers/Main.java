// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,i;
  scanf("%d",&a);
  scanf("%d",&b);
  int greater = 0;
  if(a>b)
    greater = a;
  else
    greater = b;
  for (i=greater;i>0;i--)
  {
    if ((a%i==0) && (b%i==0))
    {
      printf("%d",i);
    	break;
    }
    else
      continue;
  }
   return 0;
}