#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c,d;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  float overs = a/6;
  float over_fin = (d/6) + (0.1*(d%6));
  float crr = c/over_fin;
  float trr = b/overs;
  printf("%.0f\n",overs);
  printf("%.1f\n",over_fin);
  printf("%.1f\n",crr);
  printf("%.1f\n",trr);
  float e = crr>trr?printf("Eligible to Win"):printf("Not Eligible to Win");
return 0;
}