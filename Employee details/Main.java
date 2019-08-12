#include<stdio.h>
union emp
{
	char name[20];
    int sal;
};
int main()
{
  union emp e;
  scanf("%s",&e.name);
  scanf("%d",&e.sal);
  printf("Enter the Employee details\n");
  printf("Enter the Employee name\n");
  printf("Enter the Employee salary\n\n");
  printf("Employee Details\n");
  printf("'  %d",e.sal);
}