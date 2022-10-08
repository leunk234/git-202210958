#include <stdio.h>
void transformation(int n)
{
	if (n == 0 || n == 1)
		printf("%d ", n);

	else {
		transformation(n / 2);
		printf("%d ", n % 2);
	}
}

int main(void)
{
	int a;

	printf("please enter a number :");
	scanf_s("%d", &a);
	if (a >= 1)
		transformation(a);
	else
		printf("please enter 0or positive number");
	return 0;
}
