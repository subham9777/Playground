#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  int arr[a];
  int arr1[b];
  int sum_arr=0,sum_arr1=0;
  for(int i=0;i<a;i++)
  {
    scanf("%d",&arr[i]);
    sum_arr+=arr[i];
  }
  for(int i=0;i<b;i++)
  {
    scanf("%d",&arr1[i]);
    sum_arr1+=arr1[i];
  }
  if(a==b && sum_arr==sum_arr1)
    printf("Same");
  else
    printf("Not Same");
}