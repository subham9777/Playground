#include<stdio.h>
struct employee
{
  int id;
  char name[50];
  int bas_sal;
  int hra;
  int da;
  int med_all;
  int pf;
  int ins;
};
int main()
{
  int n;
  scanf("%d",&n);
  printf("Enter the number of employees:\n");
      printf("Enter your input for every employee:\n");
      printf("Employee ID:\n");
      printf("Employee Name:\n");
      printf("Basic salary,HRA:\n");
      printf("DA,Medical Allowance:\n");
      printf("PF and Insurance:Employee ID:\n");
      printf("Employee Name:\n");
      printf("Basic salary,HRA:\n");
      printf("DA,Medical Allowance:\n");
  printf("PF and Insurance:Enter employee ID to get payslip:\n");
  struct employee e[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d %s %d %d %d %d %d %d",&e[i].id,&e[i].name,&e[i].bas_sal,&e[i].hra,&e[i].da,&e[i].med_all,&e[i].pf,&e[i].ins);
  }
  int a;
  scanf("%d",&a);
  for(int i=0;i<n;i++)
  {
    if(e[i].id==a)
    {
      printf("Salary slip of %s:\n",e[i].name);
      printf("Employee ID:%d\n",e[i].id);
      printf("Basic Salary:%d\n",e[i].bas_sal);
      printf("House Rent Allowance:%d\n",e[i].hra);
      printf("Dearness Allowance:%d\n",e[i].da);
      printf("Medical Allowance:%d\n",e[i].med_all);
      int gross_sal = (e[i].bas_sal*12)+(e[i].hra*12)+(e[i].da*12)+(e[i].med_all*12);
      printf("Gross Salary:%.2f Rupees\n",(float)gross_sal);
      printf("Deductions:\n");
      printf("Provident fund:%d\n",e[i].pf);
      printf("Insurance:%d\n",e[i].ins);
      int net_sal = gross_sal - (e[i].pf*12)-(e[i].ins*12);
      printf("Net Salary:%.2f Rupees",(float)net_sal);
    }
  }
}