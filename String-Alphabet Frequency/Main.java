#include<stdio.h>
int main()
{
  //fill your code
  char a[20];
  scanf("%s",&a);
  int c=0,count[26] = {0},x;
  while(a[c]!='\0')
  {
    if(a[c]>='a' && a[c]<='z')
    {
      x=a[c]-'a';
      count[x]++;
    }
    c++;
  }
  for(int i=0;i<26;i++)
  {
    if(count[i]!=0)
      printf("%c %d\n",i+'a',count[i]);
  }
}