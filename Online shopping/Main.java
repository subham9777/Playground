#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e,f,g,h,i;
  scanf("%d %d %d %d %d %d %d %d %d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
  int fl = a-(a*b/100)+c;
  int sn = d-(d*e/100)+f;
  int am = g-(g*h/100)+i;
  printf("In Flipkart: Rs.%d\n",fl);
  printf("In Snapdeal: Rs.%d\n",sn);
  printf("In Amazon: Rs.%d\n",am);
  if(fl<sn && fl<am)
    printf("He will prefer Flipkart");
  else if(sn<fl && sn<am)
    printf("He will prefer Snapdeal");
  else if(am<sn && am<fl)
    printf("He will prefer Amazon");
}