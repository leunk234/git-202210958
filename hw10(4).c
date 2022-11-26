#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS
typedef struct Cities {
	char Name[500];
	char Country[500];
	int Population;
}Cites;

void clearline(void) {
	while (getchar() != '\n')
		;
}

int main(void)
{
	unsigned int i;
	Cites arr[3];
	printf("Input three cities: \n");
	for (i = 0; i < 3; i++)
	{
		printf("Name> ");

		gets_s(arr[i].Name, 500);
		printf("Country> ");



		gets_s(arr[i].Country, 500);

		printf("Population> ");
		scanf_s("%d", &arr[i].Population);

		getchar();
	}
	printf("Printing the three cities: \n");
	for (i = 0; i < 3; i++)
	{
		printf("%d. %s in %s with a population of %d people\n", i + 1, arr[i].Name, arr[i].Country, arr[i].Population);
	}

	return 0;
}