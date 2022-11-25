#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS
typedef struct Cities {
	char Name[500];
	char Country[500];
	int Population;
}Cites;


int main(void)
{
	unsigned int i;
	Cites arr[3];
	printf("Input three cities: \n");
	for (i = 0; i < 3; i++)
	{
		printf("Name> ");

		fgets(arr[i].Name, sizeof(arr[i].Name), stdin);
		printf("Country> ");


		fgets(arr[i].Country, sizeof(arr[i].Country), stdin);

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