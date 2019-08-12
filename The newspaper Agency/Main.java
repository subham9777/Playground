#include<stdio.h>
int main()
{
  //fill your code
  int no,cp,cc;
  scanf("%d %d %d",&no,&cp,&cc);
  int profit = (no*cp)-(no*cc)-100;
  printf("%d",profit);
}