/**
 *    author:  vinhntse160258
 *    created: 15.09.2021
**/
///----------------------------------------------
#include<stdio.h>
///---------------------------------------------- bai 5 ----------------------------------------------///
int year;
double balance;
float rate;
///----------------------------------------------
void sol(){
      printf("\nYear                 Balance                    Rate\n");
      for(int i = 1; i <= year; i ++){
            balance = balance * (1.0 + rate / 100.0);
            printf("%d                    %.3lf                    %.3lf\n", i, balance, rate);
      }
}
///----------------------------------------------
int main(){

      printf("Year = ");
      scanf("%d", &year);
      printf("Balance = ");
      scanf("%lf", &balance);
      printf("Rate = ");
      scanf("%f", &rate);
      sol();
}
