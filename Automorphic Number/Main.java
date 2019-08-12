#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  if(a>9)
    printf("Invalid input");
  else if((a*a)%10==a)
    printf("Automorphic Number");
  else
    printf("Not Automorphic Number");
}