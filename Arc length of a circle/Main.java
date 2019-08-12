#include<stdio.h>
int main()
{
  float r,center_angle;
  scanf("%f",&r);
  scanf("%f",&center_angle);
  float pi = 3.14;
  float arc_len = (center_angle/360)*(2*pi*r);
  printf("%.2f",arc_len);
  return 0;
}
