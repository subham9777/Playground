#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int pos;
  scanf("%d",&pos);
  int num;
  scanf("%d",&num);
  for(int j=n-1;j>=pos-1;j--)
    arr[j+1] = arr[j];
  arr[pos-1]=num;
  printf("Array after insertion is:\n");
  for(int i=0;i<=n;i++)
    printf("%d\n",arr[i]);
}