#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void)
{
	int arr[5];
	int i, a = 0, b = 0, c = 0, d = 0;
	printf("Please input five integers: ");
	for (i = 0; i < 5; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("Odd numbers:");
	for (i = 0; i < 5; i++)
	{
		if (arr[i] % 2 == 1)
		{
			printf(" %d", arr[i]);
		}
	}
	printf("\n");
	printf("Even numbers:");
	for (i = 0; i < 5; i++)
	{
		if (arr[i] % 2 == 0)
		{
			printf(" %d", arr[i]);
		}
	}

	return 0;
}