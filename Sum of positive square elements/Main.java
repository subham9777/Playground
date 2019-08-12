#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    float sq= sqrt(a[i]);
    int s = sq;
    if(s==sq)
      printf("%d",a[i]);
  }
}