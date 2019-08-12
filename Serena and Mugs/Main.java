#include<stdio.h>
int main()
{
  //fill your code
  int no_mug,vol_cup;
  scanf("%d %d",&no_mug,&vol_cup);
  int mug[no_mug];
  int count=0;
  for(int i=0;i<no_mug;i++)
  {
    scanf("%d",&mug[i]);
  }
  for(int i=0;i<no_mug;i++)
  {
    if(mug[i]<vol_cup)
      count++;
  }
  if(count==no_mug)
    printf("YES");
  else
    printf("NO");
}