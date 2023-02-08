/**
 *    author:  vinhntse160258
 *    created: 01.11.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<string.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
#define InF 1<<30
#define u64 unsigned long
///---------------------------
typedef long int li;
typedef long long int lli;
typedef unsigned long long ull;
typedef long double ld;
const int LIM = 1e5 + 1;
const int MMAX = 1e2 + 1;
///---------------------------
#define pr printf
#define sc scanf
#define pu puts("")
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
#define rt(x) return x
///---------------------------
int inp(int a){
      sc("%d", &a);
      return a;
}
///---------------------------
void dectobin(int n){
      char a[MMAX];
      itoa(n, a, 2);
      printf("Dec to bin = %s\n", a);
}
///---------------------------
void dectooct(int n){
      char a[MMAX];
      itoa(n, a, 8);
      printf("Dec to oct = %s\n", a);
}
///---------------------------
void dectohex(int n){
      char a[MMAX];
      itoa(n, a, 16);
      printf("Dec to hex = %s\n", a);
}
///---------------------------
signed main(){
      int N;
      //sc("%d", &N);
      N = inp(N);
      pr("N = ");
      if(N < 0) pr("Invalid");
      else pr("%d\n", N);
      pr("Base = ");
      int base;
      base = inp(base);
      switch (base){
            case 2:
                  dectobin(N);
                  break;
            case 8:
                  dectooct(N);
                  break;
            case 16:
                  dectohex(N);
                  break;
            default:
                  printf("Invalid base");
      }
}
