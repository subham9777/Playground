#include<stdio.h>
int main()
{
  //fill your code
  int n,sum=0;
  scanf("%d",&n);
  int a[n],b[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=0;i<n;i++)
    scanf("%d",&b[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(b[i]<b[j])
      {
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
      }
    }
  }
  for(int i=0;i<n;i++)
  {
    int prod = a[i]*b[i];
    sum+=prod;
  }
  printf("%d",sum);
}