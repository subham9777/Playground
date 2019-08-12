#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int b[a];
  for(int i=0;i<a;i++)
  {
    scanf("%d",&b[i]);
    printf("%d\n",b[i]);
  }
}
