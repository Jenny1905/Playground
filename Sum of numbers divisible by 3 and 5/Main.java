#include <stdio.h>
int main(){ 
    int m,n,sum=0;
    scanf("%d%d",&m,&n);
    for(int a0=m; a0<n; a0++){
        if(a0%3==0 && a0%5==0){
            sum+=a0;
        }
        
    }
        
printf("%d", sum);
}