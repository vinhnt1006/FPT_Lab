/**
 *    author:  vinhntse160258
 *    created: 01.11.2021
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
void inp(char c[]){
      gets(c);
}
///---------------------------
void display(char c[]){
      pr("chars are alphabet or digit: \n");
      re(i, 0, strlen(c) - 1)
            if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= '1' && c[i] <= '9'))
                  pr("%c ", c[i]);
}
///---------------------------
void largest(char c[]){
      int start = 0, longest = 0, longest_pos = 0;
      pr("the word whose length is largest: ");
      for (int i = 0; c[i] != '\0'; i++) {
            if (c[i] == ' ') start = i + 1;
            else {
                  if (i - start + 1 > longest) {
                        longest = i - start + 1;
                        longest_pos = start;
                  }
            }
      }
      for(int i = longest_pos; i < longest_pos + longest; i ++) pr("%c", c[i]);
}
///---------------------------
///---------------------------
///---------------------------
signed main(){
      char a[MMAX];
      inp(a);
      display(a);
      pu;
      largest(a);
}
