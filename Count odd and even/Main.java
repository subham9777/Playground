#include<stdio.h>
int main()
{
  //fill your code
  int n;
  scanf("%d",&n);
  int a[n];
  int ev_c=0,od_c=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&a[i]);
    if(a[i]%2==0)
      ev_c++;
    else
      od_c++;
  }
  printf("Odd: %d\nEven: %d",od_c,ev_c);
}