#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  int dollars = a+c;
  int cents = b+d;
  if(cents>=100)
  {
    dollars+=1;
    cents-=100;
  }
  printf("%d\n%d",dollars,cents);
}