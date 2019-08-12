#include<stdio.h>
int main()
{
  //fill your code
  int n,j;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int num;
  int flag=0;
  scanf("%d",&num);
  for(j=0;j<n;j++)
  {
    if(arr[j]==num)
    {
      flag=1;
      break;
    }
  }
  if(flag)
    printf("%d is present in the array",arr[j]);
  else
    printf("%d is not present in the array",num);
}