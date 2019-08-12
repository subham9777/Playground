#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int pos;
  scanf("%d",&pos);
  for(int j=pos-1;j<n-1;j++)
    arr[j]=arr[j+1];
  printf("Array after deletion is:\n");
  for(int i=0;i<n-1;i++)
    printf("%d\n",arr[i]);
}