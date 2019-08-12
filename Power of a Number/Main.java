#include<stdio.h>
int power(int base,int po);
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int result = power(a,b);
  printf("%d",result);
}
int power(int base,int po)
{
  if(po!=0)
    return (base*power(base,po-1));
  else
    return 1;
}