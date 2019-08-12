#include<stdio.h>
int main()
{
  //fill your code
  char str[50];
  int a,c;
  float b;
  int flag=0;
  scanf("%s %d %f %d",&str,&a,&b,&c);
  if(c==0 && b>=7.0)
    flag=1;
  else if(c>0 && b>=7.5)
    flag=1;
  else
    flag=0;
  printf("%s\n",str);
  printf("%d\n",a);
  if(flag==1)
    printf("Eligible to attend placement");
  else
    printf("Not Eligible to attend placement");
return 0; 
}
  
  