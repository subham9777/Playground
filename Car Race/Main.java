#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c,d;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  if(a%d==0)
    printf("Car 1 goes into road A");
  else if(b%d==0)
    printf("Car 1 goes into road B");
  else if(c%d==0)
    printf("Car 1 goes into road C");
  else
    printf("No path exist");
}