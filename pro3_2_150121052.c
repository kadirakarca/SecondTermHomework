//
//  main.c
//  pro2_150121052
//
//  Created by Kadir Akarca on 18.05.2023.
//

#include <stdio.h>
double calculateWeightBackIterative(int row, int colon);
double calculateWeightBackRecursive(int row,int colon);
int main(void) {
    int colon ;
    int row;
    printf("enter the row: ");
    scanf("%d",&row);
    printf("enter the colon: ");
    scanf("%d",&colon);
    double iterative = calculateWeightBackIterative(row,colon);
    double recursive = calculateWeightBackRecursive(row,colon)-80;
    printf("recursive =  %f \n",recursive);
    printf("iterative = %f \n",iterative);
    
    
    return 0;
}
//this method calculates using loop
double calculateWeightBackIterative(int row, int colon){
    double pyramid [row+1][row+1];
    double a ;
    int i ;
    int j;
    if(colon==0&& row==0){
        return  0;
    }
    double weight = 80;
    for(i=0;i<=row;i++){
        for(j=0;j<=i;j++){
            if(i==0 && j==0){
                pyramid[i][j]=0.0;
            }
            else if(j==0){
                pyramid[i][j]=(pyramid[i-1][j] + weight)/2;
                a = pyramid[i][j];
            }
            else if(j==i){
                pyramid[i][j]=(pyramid[i-1][j] + weight)/2;
                a = pyramid[i][j];
            }
            else{
                pyramid[i][j]=(pyramid[i-1][j-1]+weight)/2 + (pyramid[i-1][j]+weight)/2;
                a = pyramid[i][j];
                
            }
        }
    }
    return pyramid[row][colon];
}
//this method is loop and lobal
//created without using values
double calculateWeightBackRecursive(int row, int colon) {
    if (row == 0 && colon == 0) {
              return 80.0;
              
          } else if (colon < 0 || colon > row) {
              return 0.0;
          } else {
              double weight = 80.0;
              weight += ( calculateWeightBackRecursive(row - 1, colon - 1)+calculateWeightBackRecursive(row - 1, colon) )/2;
              return weight;
          }
      }
