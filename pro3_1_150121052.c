//
//  main.c
//  150121052
//
//  Created by Kadir Akarca on 18.05.2023.
//

#include <stdio.h>
void reverseN(int *number,int n);

int main(void) {
    
    int number;
    int n;
    printf("Enter a number \n");
    scanf("%d",&number);
    printf("Enter a n \n");
    scanf("%d",&n);
    reverseN(&number, n);
    printf("new number: %d \n",number);
    
    
    return 0;
}
// this method reverses numbers
void reverseN(int *number,int n){
    int count=0;
    int no1 = *number;
    //this loop determines how many digits it has
    for(;no1>0;){
        no1/=10;
        count++;
    }
    int divided=1;
    int i;
    //this loop determines how many digits to reset
    for(i=0;i<n;i++){
        divided = divided *10;
    }
    int divided2 = divided;
    int no2 = *number;
    int remain = no2 % divided;
    int reverse=0;
    for(i=1;i<=n;i++){
        int a = remain% 10;
        remain= remain /10;
        reverse= reverse + (a * divided);
        divided= divided/10;
    }
    reverse= reverse /10;
    
    int result ;
    result = (no2/divided2)*divided2 + reverse ;
    *number = result;
}
