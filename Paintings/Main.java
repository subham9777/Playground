#include<stdio.h>
int main()
{
  //fill your code
  int l,b,l1,b1,l2,b2;
  scanf("%d %d %d %d %d %d",&l,&b,&l1,&b1,&l2,&b2);
  int area_wall = l*b;
  int area_painting = (l1*b1)+(l2*b2);
  int c = area_painting<=area_wall?printf("Raj can fix both painting"):printf("Raj cannot fix both painting");
}