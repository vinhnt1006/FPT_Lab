/**
 *    author:  vinhntse160258
 *    created: 04.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
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
const int LIM = 1e5;
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
      pr("Values: ");
      re(i, 0, n - 1) pr("%d ", a[i]);
      puts("");
}
///---------------------------
void outodd(int* a, int n){
      pr("Odd values: ");
      re(i, 0, n - 1) if(*(a+i) & 1) pr("%d ", a[i]);
      puts("");
}
///---------------------------
int sumodd(int* a, int n){
      int s = 0;
      re(i, 0, n - 1) if(*(a+i) & 1) s += *(a+i);
      return s;
}
///---------------------------
int min_location(int* a, int n){
      int qq1 = INT_MAX, vt2 = -1;
      re(i, 0, n - 1) {
            if(qq1 > *(a + i)) qq1 = *(a + i), vt2 = i;
      }
      return vt2;
}
///---------------------------
int max_location(int* a, int n){
      int qq = INT_MIN, vt1 = -1;
      re(i, 0, n - 1)  {
            if(qq < *(a + i)) qq = *(a + i), vt1 = i;
      }
      return vt1;
}
///---------------------------
void Sieve_of_Eratosthenes(int* a, int n){
      puts("Primes number: ");
      bool mark[LIM + 1];
      for (long i = 1; i <= LIM; i += 2) mark[i] = true;
      mark[1] = false;
      mark[2] = true;
      for (long i = 3; i * i <= LIM; i += 2)
            if (mark[i] == true)
                  for (long j = i * i; j <= LIM; j += i) mark[j] = false;
      re(i, 0, n - 1)
            if(mark[*(a+i)] == true) pr("%d ", a[i]);
}
///---------------------------
signed main(){
      int n;
      scanf("%d", &n);
      int* t=inpInt(n);
      outInt(t, n);
      outodd(t, n);
      pr("Sum odd =  %d\n", sumodd(t,n));
      pr("Min location = %d\n",  min_location(t, n));
      pr("Max location = %d\n",  max_location(t, n));
      Sieve_of_Eratosthenes(t,n);
}
