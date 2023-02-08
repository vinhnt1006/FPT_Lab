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
int* inpInt(int n){
      int* pt = (int* ) calloc(n, sizeof( int ));
      re(i, 0, n - 1) sc("%d",&pt[i]);
      return pt;
}
///---------------------------
void* outInt(int* pt, int n){
      re(i, 0, n - 1) pr("%3d", pt[i]);
}
///---------------------------
signed main(){
      int n;
      sc("%d", &n);
      outInt(inpInt(n),n);
      //printf("%d\n", *inpInt(n));
}
