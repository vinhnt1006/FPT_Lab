/**
 *    author:  vinhntse160258
 *    created: 29.10.2021
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
int check(int n){
      int a = n%10;
      int b = n/100;
      if(a == b) return 1;
      else return 0;
}
///---------------------------
void solve(){
      re(i, 101, 998)
            if(check(i))
                  pr("%d, ", i);
      puts("999");
}
///---------------------------
signed main(){
      pr("List of number: ");
      solve();
}
