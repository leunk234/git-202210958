#define _CRT_SECURE_NO_WARNINGS
#include <math.h>
#include <stdio.h>
double standdev(double num[]);
int main(void) {
	double arr[5];
	printf("Enter 5 real numbers: ");
	for (int i = 0; i < 5; i++)
	{
		scanf(" %lf",&arr[i]);
	}
	
	printf("Standard Deviation = %.3f",standdev(arr));
	return 0;
}



 double standdev(double num[])
{
	 double total1=0,total2=0,pm,k;
	 for (int i = 0; i < 5; i++)
	 {
		 total1 += num[i];
	 }
	 pm = total1 / 5;
	 for (int i = 0; i < 5; i++)
	 {
		 k = pow(num[i] - pm, 2);
		 total2 += k;
	 }
	 k = sqrt(total2 / 5);
	 return k;
	
	

}


