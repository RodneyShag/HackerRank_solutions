#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	printf("Hello, World!");
    printf("\n");
    char s[100];
    scanf("%[^\n]%*c", &s);
  	printf("%s",s);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
