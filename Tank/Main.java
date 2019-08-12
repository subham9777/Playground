#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c,d;
  scanf("%f %f %f %f",&a,&b,&c,&d);
  float vol = 3.14*a*a*b;
  float time = vol/c;
  float e = d>time?printf("The tank can be filled within %.1f hours",d):printf("The tank cannot be filled within %.1f hours",d);
}