#include <stdio.h>
int main() {
	//Type your code
  int rem = 0;
  int num;
  int temp=0;
  scanf("%d",&num);
  while(num>0){
  	temp = num%10;
    rem = rem+temp;
    num = num/10;
  }
  printf("%d",rem);
	return 0;
}