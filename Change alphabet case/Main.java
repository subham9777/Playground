#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  int a =c;
  if(a>=65 && a<=90)
  	printf("%c",a+32);
  else
    printf("%c",a-32);
	return 0;
}