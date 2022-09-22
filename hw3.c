#include<stdio.h>
int main(void)
{
	int row = 0, a = 1, b = 1, c = 1;
	printf("몇 줄로 쌓을건지 선택하세요.");
	scanf_s("%d", &row);
	for (; a <= row; a++)
	{
		for (b = 1; b <= row - a; b++)
		{
			printf(" ");
		}
		for (c = 1; c <= 2 * a - 1; c++)
		{
			printf("*");
		}
		printf("\n");
	}
	return  0;
}