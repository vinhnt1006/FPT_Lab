/**
 *    author:  vinhntse160258
 *    created: 06.10.2021
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
const long LIM = 1e6 + 1;
///---------------------------
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
int random(int minN, int maxN){
    return minN + rand() % (maxN + 1 - minN);
}
///---------------------------
int* inpInt(int n){
      int *a = (int*) calloc(n, sizeof(long));
      re(i, 0, n - 1) a[i] = random(0, LIM);
      return a;
}
///---------------------------
void outInt(int* a, int n){
      pr("Values: ");
      re(i, 0, n - 1) pr("%d ", a[i]);
      puts("");
}
///---------------------------
void outodd(int* a, int n){
      pr("Odd values: ");
      re(i, 0, n - 1) if(*(a + i) & 1) pr("%d ", a[i]);
      puts("");
}
///---------------------------
signed main(){
      srand((int)time(0));
      int limit_min, limit_max;
      pr("Random N from value ");
      sc("%d", &limit_min);
      pr("to value ");
      sc("%d", &limit_max);
      int n = random(limit_min,limit_max);
      pr("n = %d\n", n);
      int *t = inpInt(n);
      outInt(t,n);
      outodd(t,n);
}
