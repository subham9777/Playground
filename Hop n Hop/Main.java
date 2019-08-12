#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int x=3,y=4;
  int hops = sqrt(((a-x)*(a-x)) + ((b-y)*(b-y)));
  printf("%d",hops);
}