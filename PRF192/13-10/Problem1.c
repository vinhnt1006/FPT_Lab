/**
 *    author:  vinhntse160258
 *    created:
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
const int LIM = 1e5 + 1;
#define pr printf
#define sc scanf
#define fo(i,a,b) for(int i = a; i <= b; i++)
#define I 1e18
///---------------------------
int** input(int n, int m){
      int** a = (int**) calloc(n, sizeof(int*));
      fo(i, 0, n){
            a[i] = (int*) calloc(m, sizeof(int));
            fo(j, 0, m)
                  sc("%d", &a[i][j]);
      }
      return a;
}
///---------------------------
void output(int** a, int n, int m){
      fo(i, 0, n){
            fo(j, 0, m)
                  pr(" %d  ", a[i][j]);
            puts("");
      }
}
///---------------------------
int sum(int** a, int n, int m){
      int s = 0;
      fo(i, 0, n)
            fo(j, 0, m)
                  s += a[i][j];
      return s;
}
///---------------------------
int min(int** a, int n, int m){
      int s = INT_MAX;
      fo(i, 0, n)
            fo(j, 0, m)
                  s = (s >= a[i][j] ? a[i][j] : s);
      return s;
}
///---------------------------
int max(int** a, int n, int m){
      int s = INT_MIN;
      fo(i, 0, n)
            fo(j, 0, m)
                  s = (s <= a[i][j] ? a[i][j] : s);
      return s;
}
///---------------------------
void odd_values(int** a, int n, int m){
      pr("Odd values = ");
      fo(i, 0, n)
            fo(j, 0, m)
                  if(a[i][j] & 1) pr("%d ", a[i][j]);
      puts("");
}
///---------------------------
void Sieve_of_Eratosthenes(int** a, int n, int m){
      puts("Primes number: ");
      bool mark[LIM + 1];
      for (long i = 1; i <= LIM; i += 2) mark[i] = true;
      mark[1] = false;
      mark[2] = true;
      for (long i = 3; i * i <= LIM; i += 2)
            if (mark[i] == true)
                  for (long j = i * i; j <= LIM; j += i) mark[j]=false;
      fo(i, 0, n)
            fo(j, 0, m)
                  if(mark[a[i][j]] == true) pr("%d ", a[i][j]);
}
///---------------------------
signed main(){
      int n, m;
      pr("Columns = ");
      sc("%d", &n);
      pr("Rows = ");
      sc("%d", &m);
      n--; m--;
      int** a=input(n, m);
      output(a, n, m);
      pr("Sum = %d\n", sum(a, n, m));
      pr("Min values = %d\n", min(a, n, m));
      pr("Max values = %d\n", max(a, n, m));
      odd_values(a, n, m);
      Sieve_of_Eratosthenes(a, n, m);
}
