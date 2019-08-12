#include<stdio.h>
struct employee
{
  char name[50];
  int id;
  int age;
  char des[20];
  int salary;
}e;
int main()
{
  printf("Enter name:\n");
  printf("Enter ID:\n");
  printf("Enter age:\n");
  printf("Enter designation:\n");
  printf("Enter Salary:\n");
  printf("Employee Details\n");
  scanf("%s %d %d %s %d",&e.name,&e.id,&e.age,&e.des,&e.salary);
  printf("Name of the Employee:%s\n",e.name);
  printf("ID of the Employee:%d\n",e.id);
  printf("Age of the Employee:%d\n",e.age);
  printf("Designation of the employee:%s\n",e.des);
  printf("Salary of the Employee:%d\n",e.salary);
}