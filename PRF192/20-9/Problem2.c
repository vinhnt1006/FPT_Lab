/**
 *    author:  vinhntse160258
 *    created:  20.09.2021
**/
///------------------------------------------------
#include<stdio.h>
///------------------------------------------------
char t;
///------------------------------------------------
void sol(){
      while(1){
            scanf(" %c", &t);
            if(t != '0') printf("Ma ASCII cua ki tu c la: %d\n", t);
            else return ;
      }
}
///------------------------------------------------
signed main(){
      sol();
}