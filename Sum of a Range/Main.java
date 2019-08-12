#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int sum=0;
  while(a<=b)
  {
    sum+=a;
    a+=1;
  }
printf("%d",sum);
}