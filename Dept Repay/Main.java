#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  float interest = (a*b*c)/100;
  float total = a+interest;
  float disc = 0.02*interest;
  float final_amt = total-disc;
  printf("%.2f\n",interest);
  printf("%.2f\n",total);
  printf("%.2f\n",disc);
  printf("%.2f",final_amt);
}