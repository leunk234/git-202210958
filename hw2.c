# include <stdio.h>
int main(void)
{
	float num1;
	printf("Please enter kilometers:");
	scanf_s("%f", &num1);
	float num2 = num1 / 1.609;
	printf("%.1f km is equal to %.1f miles.", num1, num2);
	return 0;
}