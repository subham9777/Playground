#include<stdio.h>
int main()
{
  //fill your code
  int days;
  scanf("%d",&days);
  int years = days/365;
  days = days%365;
  int weeks = days/7;
  days =days%7;
  printf("%d\n",years);
  printf("%d\n",weeks);
  printf("%d",days);
}