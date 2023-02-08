/**
 *    author:  vinhntse160258
 *    created: 20.10.2021
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
const int BASE = 1e2 + 1;
///---------------------------
#define pr printf
#define sc scanf
#define pu puts("")
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
#define rt(x) return x
///---------------------------
void enter(int a[][BASE], int n, int m){
      re(i, 1, n)
            re(j, 1, m)
                  a[i][j] = -1;
      re(i, 1, n)
            re(j, 1, m)
                  sc("%d", &a[i][j]);
}
///---------------------------
void out(int a[][BASE], int n, int m){
      re(i, 1, n){
            re(j, 1, m){
                  pr("%d ", a[i][j]);
            }
            pu;
      }
}
///---------------------------
void check1(int a[][BASE], int n, int m, int s, int t){
      re(i, 1, n){
            re(j, 1, m){
                  if(a[s][t] <= 0) {
                        puts("NO");
                        return;
                  }
                  else{
                        pr("%d\n", a[s][t]);
                        return;
                  }
            }
      }
}
///---------------------------
int Tongkc(int a[][BASE], int n, int m, int s){
      int sum = 0;
      re(i, 1, m) sum += a[i][s];
      return sum;
}
///---------------------------
void Maxkc(int a[][BASE], int n, int m){
      int sum = -1, p, q;
      re(i, 1, n){
            re(j, 1, m){
                  if(sum < a[i][j]){
                        sum = a[i][j];
                        p = i;
                        q = j;
                  }
            }
      }
      pr("Khoang cach lon nhat la %d, giua hai dinh %d va %d", sum, p, q);
}
///---------------------------
signed main(){
      int a[BASE][BASE], Trace[BASE][BASE];
      int n, m;
      pr("So hang = ");
      sc("%d", &n);
      pr("So cot = ");
      sc("%d", &m);
      enter(a, n, m);
      pu;
      int query1, query2;
      out(a, n, m);
      pr("So cap dinh can kiem tra = ");
      sc("%d", &query1);
      while(query1--){
            int s, t;
            sc("%d%d", &s, &t);
            pr("Chi phi duong di tu dinh %d den dinh %d la: ", s, t);
            check1(a, n, m, s, t);
      }
      pr("So dinh can kiem tra = ");
      sc("%d", &query2);
      pr("Tong khoang cach tu dinh %d den cac dinh con lai la: %d\n", query2, Tongkc(a, n, m, query2));
      Maxkc(a, n, m);
}
/*
4 4
0 10 9 0
10 0 23 6
9 23 0 12
0 6 12 0
*/
