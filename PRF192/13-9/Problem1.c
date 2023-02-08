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
char c;
///---------------------------
void sol(){
      puts((c >= 'a' && c <= 'z') ? "lowercase" : (( c >= 'A' && c <= 'Z' ) ? "uppercase" : "others"));
}
int main()
{
      char c;
      scanf("%c", &c);
      sol();
}
