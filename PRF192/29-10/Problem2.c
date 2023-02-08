/**
 *    author:  vinhntse160258
 *    created: 29.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
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
void input(char c[]){
      gets(c);
}
///---------------------------
int convert(char c[], int a[]){
      int d = 0, j = 0;
      re(i, 0, strlen(c)){
            if(c[i] == ' ' && c[i - 1] == ' ') continue;
            if(c[i] == '\0') a[j] = d;
            if(c[i] != ' ') d = d * 10 + (int)(c[i] - '0');
            else{
                  a[j] = d;
                  j++;
                  d = 0;
            }
      }
      return j;
}
///---------------------------
void even(int a[], int n){
      pr("Even numbers: ");
      re(i, 0, n - 1)
            if(a[i] % 2 == 0)
                  pr("%d ", a[i]);
}
///---------------------------
void ascii(int a[], int n){
      pr("Numbers are ascii code of alphabet: ");
      re(i, 0, n - 1)
            if(a[i] >= 65 && a[i] <= 90 || a[i] >= 97 && a[i] <= 122)
                  pr("%d ", a[i]);
}
///---------------------------
signed main(){
      char c[MMAX];
      input(c);
      int a[MMAX];
      int n = convert(c, a) + 1;
      even(a, n);
      pu;
      ascii(a, n);
}
