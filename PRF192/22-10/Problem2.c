/**
 *    author:  vinhntse160258
 *    created: 22.10.2021
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
const int LIM = 10;
const int MMAX = 30;
///---------------------------
#define pr printf
#define sc scanf
#define pu puts("")
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
#define rt(x) return x
///---------------------------
void input(char a[][MMAX], int n){
      re(i, 0, n - 1){
            scanf("%s[^\n]", a[i]);
      }
}
///---------------------------
void out(char a[][MMAX], int n){
      re(i, 0, n - 1){
            puts(a[i]);
      }
}
///---------------------------
int findmax(char a[][MMAX], int n){
      int p = 0;
      re(i, 1, n - 1){
            p = ((strcmp(a[i], a[p]) == 1) ? i : p);
      }
      return ++p;
}
///---------------------------
///---------------------------
///---------------------------
signed main(){
      int n;
      pr("Number of Students = ");
      sc("%d", &n);
      char a[LIM][MMAX];
      input(a, n);
      pr("\nList of students:\n");
      out(a, n);
      pr("\nLocation of the longest name is: %d", findmax(a, n));
}
