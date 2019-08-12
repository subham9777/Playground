#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  float units;
  scanf("%f",&units);
  float electricity;
  if(units<=200)
    electricity = (units*0.5);
  else if(units<=400)
    electricity = (units*0.65)+100;
  else if(units<=600)
    electricity = (units*0.8)+200;
  else if(units>600)
    electricity = (units*1.25)+425;
  printf("Rs.%.0f",ceil(electricity));
}