#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int num,flag=1;
  scanf("%d",&num);
  for(int i=0;i<n;i++)
  {
    if(num==arr[i])
    {
      printf("%d",i+1);
      flag=0;
    }
  }
  if(flag)
      printf("%d isn't present in the array.",num);
  
  return 0;
}