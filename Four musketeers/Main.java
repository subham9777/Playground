#include<stdio.h>
int main()
{
  //fill your code
  float x1,y1,x2,y2,x3,y3;
  scanf("%f %f %f %f %f %f",&x1,&y1,&x2,&y2,&x3,&y3);
  float x = (x1+x2+x3)/3;
  float y = (y1+y2+y3)/3;
  printf("%.1f\n",x);
  printf("%.1f",y);
}