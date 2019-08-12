#include<stdio.h>
#include<math.h>
int main()
{
  //fill your code
  float a,b;
  scanf("%f %f",&a,&b);
  float h = pow(b/100,2);
  float bmi = a/h;
  if(bmi<18.5)
    printf("You are underweight. Have an apple daily.");
  else if(bmi>18.5 && bmi<24.9)
    printf("You are normal. Go walking daily and maintain it.");
  else if(bmi>25 && bmi<29.9)
    printf("You are overweight. Go to the gym daily.");
  else if(bmi>30)
    printf("You are obese. Go to doctor");
}