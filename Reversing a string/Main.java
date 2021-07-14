#include <stdio.h>
#include <string.h>
 
int main()
{
  	char Str[100], RevStr[100];
  	int i, j, len;
 
  	gets(Str);
  	
  	j = 0;
  	len = strlen(Str);
 
  	for (i = len - 1; i >= 0; i--)
  	{
  		RevStr[j++] = Str[i];
  	}
  	RevStr[i] = '\0';
 
  	printf("%s", RevStr);
  	
  	return 0;
}