#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char str[100];
  gets(str);
  int count=1;
  if(strlen(str)>20)
  {
    printf("Invalid Input");
    return 0;
}    
 for(int i=1;i<=strlen(str);i++)
    {
      if(str[i]==str[i-1])
        count=count+1;
    
  else
  {
    printf("%c%d",str[i-1],count);
  	count=1;
}    
}    
  }
