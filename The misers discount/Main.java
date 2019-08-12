#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c;
  scanf("%f %f %f",&a,&b,&c);
  printf("%.2f\n",a+b);
  float disc = (a+b)*0.01*c;
  printf("%.2f\n",(a+b)-disc);
  printf("%.2f",disc);
}