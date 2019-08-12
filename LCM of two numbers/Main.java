#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,i,mul,greater,smaller;
  scanf("%d %d",&a,&b);
  if(a>b){
    greater = a;
    smaller = b;
  }
  else{
    greater = b;
    smaller = a;
  }
  for(i=1;i<=smaller;i++)
  {
	mul = greater*i;
    if((mul%a == 0) && (mul%b == 0))
      break;
  }
  printf("%d",mul);
  return 0;
}