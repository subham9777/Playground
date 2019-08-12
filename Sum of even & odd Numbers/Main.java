#include<stdio.h>
int main()
{
  //fill your code
  int num[100];
  int sum_even=0;
  int sum_odd=0;
  int count_even=0;
  int count_odd=0;
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
    else if(num[i]%2==0)
    {
      sum_even+=num[i];
      count_even+=1;
    }
    else if(num[i]%2!=0)
    {
      sum_odd+=num[i];
      count_odd+=1;
    }
  }
  float even_avg = sum_even/count_even;
  float odd_avg = (float)sum_odd/(float)count_odd;
  printf("%d\n%d\n%.2f\n%.2f",sum_even,sum_odd,even_avg,odd_avg);
}