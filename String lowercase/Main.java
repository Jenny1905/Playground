#include<stdio.h>
int main()
{
  char str[100];
  scanf("%s",str);
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]>='A' && str[i]<='Z')
    {
      str[i]=str[i]+32;
    }
  }
  printf("String with lowercase is %s",str);
}
  
  
