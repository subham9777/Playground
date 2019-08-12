#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,ele1_index=-1,ele2_index=-1;
  scanf("%d",&n);
  int num[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&num[i]);
  }
  int n1,n2;
  scanf("%d %d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    if(n1==num[i] && ele1_index==-1)
    {
      ele1_index=i;
    }
    if(n2==num[i] && ele2_index==-1)
    {
      ele2_index=i;
    }
    
  }
   printf("Element 1 index = %d\n",ele1_index);
   printf("Element 2 index = %d\n",ele2_index);
}