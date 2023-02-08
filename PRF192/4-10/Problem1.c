/**
 *    author:  vinhntse160258
 *    created: 04.10.2021
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
///---------------------------
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
int* inpInt(int n){
      int* a = (int* ) calloc(n, sizeof( int ));
      re(i, 0, n - 1) sc("%d", &a[i]);
      return a;
}
///---------------------------
void outInt(int* a, int n){
      printf("Values: ");
      re(i, 0, n - 1) pr("%d ", a[i]);
      puts("");
}
///---------------------------
int sum(int* a, int n){
      int s = 0;
      re(i, 0, n - 1) s += *(a + i);
      return s;
}
///---------------------------
double avg(int* a, int n){
      return (1.00 * sum(a, n)) / n;
}
///---------------------------
int max(int* a, int n){
      int qq = INT_MIN;
      re(i, 0, n - 1) {
            qq = (qq < *(a + i) ? *(a + i) : qq);
      }
      return qq;
}
///---------------------------
int min(int* a, int n){
      int qq1 = INT_MAX;
      re(i, 0, n - 1) {
            qq1 = (qq1 > *(a + i) ? *(a + i) : qq1);
      }
      return qq1;
}
///---------------------------
signed main(){
      int n;
      scanf("%d", &n);
      int* t=inpInt(n);
      outInt(t, n);
      pr("Sum = %d\n", sum(t, n));
      pr("AVG = %.6f\n", avg(t,n));
      pr("Max = %d\nMin = %d",  max(t,n), min(t,n));
}
