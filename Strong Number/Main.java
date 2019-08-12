#include <stdio.h>
int main() {
	//Type your code
  int n,num,sum=0;
  scanf("%d",&n);
  num = n;
 while(num!=0)
 {
   int rem = num%10;
   int fact=1;
   for(int i=1;i<=rem;i++)
   {
     fact=fact*i;
   }
   sum = sum+fact;
   num = num/10;
 }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
      
	return 0;
}