/**
 *    author:  vinhntse160258
 *    created: 29.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
#define INF 1<<30
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
void input(char a[]){
      gets(a);
}
///---------------------------
void alpha(char a[]){
      pr("Alphabet characters: ");
      re(i, 0, strlen(a) - 1)
            if(a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z')
                  pr("%c ", a[i]);
}
///---------------------------
void ascii(char a[]){
      pr("Ascii codes: ");
      re(i, 0, strlen(a) - 1){
            if(a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z' || a[i] == ' ') continue;
            pr("%d ", a[i]);
      }
}
///---------------------------
signed main(){
      char a[MMAX];
      input(a);
      alpha(a);
      pu;
      ascii(a);
}
