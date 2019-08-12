#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int last = num%10;
  int first = 0;
  int rem = 0;
  while(num>0)
  {
    rem = num%10;
    first = rem;
    num = num/10;
  }
  printf("%d",last+first);
	return 0;
}