#include<stdio.h>
 main()
 {
   int array[100], search, c, number;
   scanf("%d",&number);
   for ( c = 0 ; c < number ; c++ )
   scanf("%d",&array[c]);
   scanf("%d",&search);
   for ( c = 0 ; c < number ; c++ )
   {
     if ( array[c] == search )   /* if required element found */
     {
       printf("%d is present at location %d\n", search, c+1);
       break;
     }
   }
   if ( c == number )
     printf("Element not found");
   return 0;
 }
 