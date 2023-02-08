/**
 *    author:  vinhntse160258
 *    created: 01.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
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
signed main(){
      int* pt = NULL;
      pt = (int* ) calloc(4, sizeof( int ));
      *pt = 20; *(pt+1)=30;
      *(pt + 2) = 75;
      *(pt + 3) = 40;
      pr("%d\n%d\n%d\n", *pt, pt, *(pt + 1));

}
