#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  if (a>=b && a>=c){
  	if (b>=c){
    	printf("%d",b);
    }
    else {
      printf("%d",c);
    }
  }
    else if (b>=a && b>=c){
  	if (a>=c){
    	printf("%d",a);
    }
    else {
      printf("%d",c);
    }
  }
    else if (c>=a && c>=b){
  	if (b>=a)
    {
    	printf("%d",b);
    }
    else {
      printf("%d",a);
    }
  }
  return 0;
}