/**
 *    author:  vinhntse160258
 *    created:
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
signed main(){
      int n=7, m=8;
      int* p1 = &n, *p2 = &m;
      *p1 += 5 + 3 * (*p2) - n;
      *p2 = 5 * (*p1) -4 * m + 2 * n;
      printf("%d %d", m, n);
}
