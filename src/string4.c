#include <stdio.h>

int CalculateLength(char *str)
{
    int iCnt = 0;
    while (*str != '\0')
    {
        iCnt++;
        str++;
    }
    return iCnt;
}
int main()
{
    char Arr[40];
    int iRet = 0;
    printf("Enter Your Name : \n");
    scanf("%[^'\n']s", Arr);

    iRet = CalculateLength(Arr);
    printf("Length of String is : %d\n", iRet);
}