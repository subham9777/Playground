#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int weight = (b*75)+(c*30);
  int d = a>=weight?printf("Boat is stable"):printf("Boat will drow");
}