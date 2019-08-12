#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  
  for(int count=1;count<=n;count++)
  {
    if(n%count==0)
      printf("%d\n",count);
  }
	return 0;
}