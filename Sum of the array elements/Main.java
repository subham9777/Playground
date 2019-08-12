#include<stdio.h>
int sumarr(int[],int);
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum = sumarr(a,n);
  printf("%d",sum);
}
int sumarr(int l[],int p)
{
  if(p==0)
    return 0;
  else
    return(sumarr(l,p-1) + l[p-1]);
}