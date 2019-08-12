#include<stdio.h>
int large(int[],int,int);
int main()
{
  //fill your code
  int n,largest;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  if(n==0)
    printf("Empty List");
  else
  {
    largest=a[0];
    largest = large(a,n-1,largest);
    printf("%d",largest);
  }
}
int large(int l[],int pos, int largest)
{
  if(pos==0)
    return largest;
  if(pos>0)
  {
    if(l[pos]>largest)
      largest = l[pos];
    return large(l,pos-1,largest);
  }
}
    