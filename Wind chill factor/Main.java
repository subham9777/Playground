#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  float wcf = (35.74)+(0.6215*a)+(((0.4275*a)-35.75)*(pow(b,0.16)));
  printf("%.2f",wcf);
}