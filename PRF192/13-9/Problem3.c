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
float a,b,c;
///---------------------------
void sol(){
       if(a + b > c && b + c > a && a + c > b){
            if(a == b && b == c) puts("equilateral triangle");
            else if(a == b || b == c || c == a) puts("isosceles triangle");
            else puts("others");
      }
      else puts("NO");
}
///---------------------------
int main()
{
      float a,b,c;
      scanf("%f%f%f",&a, &b, &c);
      sol();
}
