#include <stdio.h>
#include <string.h>

int main(void)
{
    int i = 0,len=0;
    char str[512];
    printf("Input> ");
    fgets(str, sizeof(str), stdin);
    len = strlen(str);
    const diff = 'a' - 'A';
    for (i = 0; i < len; i++)
    {
        if (str[i] >= 'A' && str[i] <= 'Z')
        {
            str[i] += diff;
        }
        else if (str[i] >= 'a' && str[i] <= 'z')
        {
   
            str[i] -= diff;
        }
    }
    printf("Out put> %s", str);

    return 0;
}