/**
 *    author:  vinhntse160258
 *    created: 01.10.2021
**/
///---------------------------
#include<stdio.h>
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
void toUpper(char* a){
      *a-=32;
}
///---------------------------
signed main(){
      char c1='a', c2='b', c3='c';
      toUpper(&c1);toUpper(&c2);toUpper(&c3);
      pr("%c %c %c", c1, c2, c3);
}
