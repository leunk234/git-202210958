#include<stdio.h>
int main(void)
{
	int a, k = 0, b ;
	printf("please enter a number");
	scanf_s("%d", &a);
	if (a < 2)
		printf("it is not a prime number");
	if (a == 2)
		printf("it is a prime number");
	for (b = 2; b < a; b++)
	{
		if (a % b == 0)
		{
			printf("it is not a prime number\n");
			break;
		}
		if (b == a - 1)
			printf("it is a prime number");

	}

	return 0;
}