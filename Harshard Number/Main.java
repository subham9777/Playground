#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a=n;
  int sum=0;
 while(n!=0)
 {
   sum = sum+(n%10);
   n=n/10;
 }
  if(a%sum==0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
}