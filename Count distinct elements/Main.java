#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  int count=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n-1;i++)
  {
    if(a[0]!=a[i])
      count+=1;
  }
  printf("There are %d distinct elements in the array.",count);
}