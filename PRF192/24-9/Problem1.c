/**
 *    author:  vinhntse160258
 *    created: 24.09.2021
**/
///---------------------------
#include<stdio.h>
//#define max(a,b) ({ a > b ? a : b; })
//#define min(a,b) ({ a > b ? b : a; })
//#define gcd(a, b) ({int r; while (b != 0){r = a % b; a = b; b = r;} a;})
#define gcd(a, b) ({int r, p = a, q = b; while (q != 0){r = p % q; p = q; q = r;} p;})
#define lcm(a, b) ({int c=gcd(a,b);a/=c; a*b;})
///---------------------------
signed main(){
      int n,m;
      scanf("%lf%lf", &n, &m);
      printf("%lf\n%lf", gcd(n,m),lcm(n,m));
}
