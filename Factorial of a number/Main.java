#include <stdio.h>
int main() {
	//Type your code
  int n ;
  scanf("%d",&n);
  int prod=1;
  for(int i=1;i<=n;i++)
  {
    prod = prod*i;
  }
  printf("%d",prod);
	return 0;
}