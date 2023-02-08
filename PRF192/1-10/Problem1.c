/**
 *    author:  vinhntse160258
 *    created: 01.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdbool.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
#define pi 3.1415926535897932384
///---------------------------
typedef long int li;
typedef long long int lli;
typedef unsigned long long ull;
typedef long double ld;
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
void swap(int* p, int* q){
      int tmp;
      tmp=*p;
      *p=*q;
      *q=tmp;
}
///---------------------------
int sum(int a, int b){
      return (a+b);
}
///---------------------------
signed main(){
      int num1=10;
      int num2=30;
      //num1^=num2;
      //num2^=num1;
      //num1^=num2;
      swap(&num1,&num2);
      printf("%d %d", num1, num2);
}
