#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int ben = (a*b/100);
  int black = ((a-ben)*c/100);
  int pir = (a-ben-black)/3;
  printf("%d\n",ben);
  printf("%d\n",black);
  printf("%d\n",pir);
}