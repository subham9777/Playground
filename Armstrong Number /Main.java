#include <stdio.h>
int main() {
	//Type your code
  int n,a;
  scanf("%d",&n);
  a = n;
  int sum=0;
  while(a!=0)
  {
    int rem = a%10;
    sum = sum + (rem*rem*rem);
    a = a/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}