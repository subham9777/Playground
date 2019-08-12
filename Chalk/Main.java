#include<stdio.h>
#include<math.h>
int main()
{
  //Fill your code
  int n;
  scanf("%d",&n);
  float chalk=(float)n;
  float a = 1/sqrt(n);
  float ad_chalk = (a*n);
  chalk = chalk+ad_chalk;
  chalk = chalk + (ad_chalk*a);
  printf("%.0f",chalk);
}