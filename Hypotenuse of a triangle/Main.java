#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float side_1,side_2;
  scanf("%f %f",&side_1,&side_2);
  float side_3 = sqrt((side_1*side_1)+(side_2*side_2));
  printf("%.2f",side_3);
  return 0;
}