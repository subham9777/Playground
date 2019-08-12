#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here 
  char a[50],b[50],c[50];
  scanf("%s %s %s",&a,&b,&c);
    for(int i=0;i<strlen(c);i++)
    {
      int x=c[i];
      if(x>=97 && x<=122)
      c[i] = x-32;
   }
  for(int i=0;i<strlen(a);i++)
  {
    switch(a[i])
    {
      case 'a':a[i] = '$';
        	break;
      case 'e':a[i] = '$';
        	break;
        case 'i':a[i] = '$';
        	break;
        case 'o':a[i] = '$';
        	break;
        case 'u':a[i] = '$';
        	break;
        case 'A':a[i] = '$';
        	break;
        case 'E':a[i] = '$';
        	break;
        case 'I':a[i] = '$';
        	break;
        case 'O':a[i] = '$';
        	break;
        case 'U':a[i] = '$';
        	break;
    }
  }
  for(int i=0;i<strlen(b);i++)
  {
    switch(b[i])
    {
      case 'a':
        	break;
      case 'e':
        	break;
        case 'i':
        	break;
        case 'o':
        	break;
        case 'u':
        	break;
        case 'A':
        	break;
        case 'E':
        	break;
        case 'I':
        	break;
        case 'O':
        	break;
        case 'U':
        	break;
        default : b[i] = '#';
    }
  }
  printf("%s%s%s",a,b,c);
  }