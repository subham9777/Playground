#include<stdio.h>
#include<string.h>
int main()
{
  //fill your code
  char a[50];
  scanf("%s",a);
  int i,j,temp;
  int n=strlen(a);
for (i = 0; i < n-1; i++) {
      for (j = i+1; j < n; j++) {
         if (a[i] > a[j]) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
         }
      }
   }
  printf("The sorted string is %s",a);
}