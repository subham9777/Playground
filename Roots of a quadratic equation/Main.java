#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c;
  float det;
  scanf("%f %f %f",&a,&b,&c);
  if(((b*b)-(4*a*c))>0){
  det = sqrt((b*b)-(4*a*c));
  float r1 = (-b + det)/(2*a);
  float r2 = (-b - det)/(2*a);
  printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(((b*b)-(4*a*c))==0)
  {
    float r1 = (-b)/(2*a);
  	float r2 = (-b)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else
  {
  det = sqrt(-((b*b)-(4*a*c)))/(2*a);
  float r1 = (-b)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",r1,det,r1,det);
  }
  return 0;
}