#include<stdio.h>
int main()
{
  //your code here
  float pr,year,rate,SI;
  scanf("%f %f %f",&pr,&year,&rate);
  SI = (pr*year*rate)/100;
  printf("%.6f",SI);
  return 0;
}