#include<stdio.h>
int main()
{
  //fill your code
  int num[10];
  int sum=0;
  for(int i=0;i<10;i++)
  {
    scanf("%d",&num[i]);
    if(num[i]==-1)
      break;
  }
  for(int i=0;i<10;i++)
  {
    if(num[i]==-1)
      break;
    sum+=num[i];
  }
  printf("%d",sum);
}