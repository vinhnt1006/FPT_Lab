/**
 *    author:  vinhntse160258
 *    created: 20.09.2021
**/
///---------------------------
#include<stdio.h>
///10^12
///---------------------------
int mark[10000005];
long n;
///---------------------------
void Sieve_of_Eratosthenes(){
      for (long i = 1; i <= n; i += 2) mark[i] = 1;
      mark[1] = 0;
      mark[2] = 1;
      for (long i = 3; i * i <= n; i += 2)
            if (mark[i] == 1)
                  for (long j = i * i; j <= n; j += i) mark[j]=0;
}
///---------------------------
void print(){
      for (long i = 1; i <= n; i ++)
            if (mark[i] == 1)  printf("%d ", i);
}
///---------------------------
int main()
{
      scanf("%ld", &n);
      Sieve_of_Eratosthenes();
      printf("So nguyen to 1 toi n la: ");
      print();
}
