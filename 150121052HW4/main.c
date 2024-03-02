//
//  main.c
//  150121052HW3
//
//  Created by Kadir Akarca on 31.05.2023.
//
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct{
    char str[50];
    int length;
}String;

int charAt(String* s,int index){
    if (index < 0 || index >= s->length)
          return -1;
      return s->str[index];
}
String* concat(String* s1,String* s2){
    String *result = (String*)malloc(sizeof(String*));
    result->length = s1->length + s2->length;
       strcpy(result->str, s1->str);
       strcat(result->str, s2->str);
       return result;
}
unsigned int strSearch(String* s1,String* s2){
    int i, j;
        unsigned int length = 0;
    int count = 0;
        for (i = 0; i < s1->length; i++) {
            for (j = 0; j < s2->length; j++) {
                count++;
                if (s1->str[i] == s2->str[j]) {
                    length++;
                    if(s2->length==length){
                        break;
                    }
                }
                
            }
        }
    for(;count<s1->length;count++){
        length++;
        if(s1->str[count]==' '){
            break;
        }
    }
        return length;
}

unsigned int findScore(String* s){
    unsigned int score = 0;
       int i;
       for (i = 0; i < s->length; i++) {
        if(s->str[i]=='A'||s->str[i]=='E'||s->str[i]=='I'||s->str[i]=='O'||s->str[i]=='U'||s->str[i]=='L'||s->str[i]=='N'||s->str[i]=='R'||s->str[i]=='S'||s->str[i]=='T'){
               score++;
           }
        else if(s->str[i]=='D'||s->str[i]=='G'){
               score+=2;
           }
        else if(s->str[i]=='B'||s->str[i]=='C'||s->str[i]=='M'||s->str[i]=='P'){
               score+=3;
           }
        else if(s->str[i]=='F'||s->str[i]=='H'||s->str[i]=='V'||s->str[i]=='W'||s->str[i]=='Y'){
               score+=4;
           }
        else if(s->str[i]=='K'){
            score += 5;
        }
        else if(s->str[i]=='J'||s->str[i]=='X'){
            score += 6;
        }
        else if(s->str[i]=='Q'||s->str[i]=='Z'){
            score += 7;
        }
       }
       return score;
}
int main(int argc, const char * argv[]) {
    char ad[] = "inputFile.txt";
    FILE *inputFile;
    inputFile = fopen(ad, "r");
    FILE *outputFile = fopen("outputFile.txt", "w");
        if (inputFile == NULL) {
            printf("input file bulunamadı\n");
            return 0;
        }
        else if  (outputFile == NULL){
            printf("output file oluşamadı \n");
            return 0;
        }
        else{
            printf("outputfile oluştu");
        }
    int statWords = 0;
    int statletters = 0;
    char line[50];
    while (fgets(line, sizeof(line), inputFile) != NULL){
        if (strcmp(line, "exit") == 0 || strcmp(line, "quit") == 0) {
            fprintf(outputFile, "Program ends. Bye\n");
            break;}
        else if (strcmp(line, "stat") == 0) {
                    fprintf(outputFile, "The number of words: %d\n",statWords);
                    fprintf(outputFile, "The number of alphabetic letters: %d\n",statletters );
                }
        else {
            char str[50];
            int c;
            int k =1;
            for(c=0;(c<strlen(line));c++){
                if(line[c]==' '){
                    statWords++;
                }
            }
            for(c=0;(c<strlen(line));c++){
                if(line[c]==';'){
                    break;
                }
                str[c] = line[c];
                k++;
            }
            char operation = line[k];
            k++;
            char usingForOperation[50] ;
            for(c=0;(c<strlen(line));c++){
                usingForOperation[c]= line[k];
                
                }
            
            
            String s;
            strcpy(s.str, str);
            s.length = (int)strlen(s.str);
            if(operation=='1'){
                int index = (atoi)(usingForOperation);
                int result= charAt(&s, index);
                char finalResult =(char)result;
                fprintf(outputFile, "%c\n", finalResult);
            }
            else if(operation=='2'){
                String temp;
                strcpy(temp.str, str);
                temp.length = (int)strlen(temp.str);
                String finalResult = *concat(&s,&temp);
                fprintf(outputFile, "%s\n", finalResult.str);
                }
            else if (operation=='3'){
                String temp;
                strcpy(temp.str, str);
                temp.length = (int)strlen(temp.str);
                unsigned int search =strSearch(&s,&temp);
                fprintf(outputFile,"%u\n",search);
            }
            else if (operation=='4'){
                unsigned int score = findScore(&s);
                fprintf(outputFile,"%u\n",score);
            }
            statWords++;
            int i=0;
            for(;i<s.length;i++){
                if ((s.str[i] >= 'A' && s.str[i] <= 'Z') || (s.str[i] >= 'a' && s.str[i] <= 'z')){
                    statletters++;
                }
            }
        }
    }
    
    printf("%d\n",statWords);
        printf("%s",line);
    fclose(inputFile);
    fclose(outputFile);
        
    
        
        
        
        
        
        
        
    return 0;
}
