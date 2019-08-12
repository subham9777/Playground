#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int rem=0;
  int second=0;
  while(num>=10)
  {
    rem = num%10;
    second = rem;
    num = num/10;
  }
  printf("%d",second);
	return 0;
}