#include<stdio.h>
int main()
{
  //fill your code
  int month,year;
  scanf("%d %d",&month,&year);
  switch(month)
  {
    case 1: printf("Number of days is 31");
      break;
    case 2: if(year%4==0)
      printf("Number of days is 29");
      else
        printf("Number of days is 28");
      break;
    case 3:printf("Number of days is 31");
      break;
  }
}