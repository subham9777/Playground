#include<stdio.h>
struct stud
{
  int roll;
  int s1,s2,s3,s4,s5;
  float avg;
  int grade;
};
int main()
{
  int n;
  scanf("%d",&n);
  struct stud s[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&s[i].roll);
    scanf("%d",&s[i].s1);
    scanf("%d",&s[i].s2);
    scanf("%d",&s[i].s3);
    scanf("%d",&s[i].s4);
    scanf("%d",&s[i].s5);
  }
  for(int i=0;i<n;i++)
  {
    s[i].avg = (s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
    if(s[i].avg>70)
      s[i].grade = 1;
    else if(50<s[i].avg<70)
      s[i].grade = 2;
    else 
      s[i].grade =3;
  }
  printf("STUDENT MARKSHEET USING STRUCTURES\n");
  printf("Enter the no of students\n\n");
  printf("rn s1 s2 s3 s4 s5 avg grade\n\n");
  for(int i=0;i<n;i++)
  {
    printf("%d %d %d %d %d %d %.2f %d\n",s[i].roll,s[i].s1,s[i].s2,s[i].s3,s[i].s4,s[i].s5,s[i].avg,s[i].grade);
  }
}