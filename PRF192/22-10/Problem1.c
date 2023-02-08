/**
 *    author:  vinhntse160258
 *    created:  22.10.2021
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
void nhap(char c[]){
      gets(c);
}
///---------------------------
void out(char c[]){
      pr("String: ");
      puts(c);
}
///---------------------------
int length(char c[]){
      return strlen(c);
}
///---------------------------
void change(char c[]){
      re(i, 0, strlen(c)){
            if(c[i] != ' ' && c[i - 1] == ' ') {
                  c[i] = toupper(c[i]);
                  break;
            }
      }
      pr("String: ");
      puts(c);
}
///---------------------------
void trimleft(char c[]){
      int i;
      for(i = 0; i < strlen(c); i++){
            if(c[i] != ' ') break;
      }
      strcpy(&c[0], &c[i]);
}
///---------------------------
void trimright(char c[]){
      strrev(c);
      trimleft(c);
      strrev(c);
}
///---------------------------
void trimall(char c[], char s[]){
      int d = 0;
      re(i, 0, strlen(c)){
            if(c[i] != ' ') {
                  s[d] = c[i];
                  d++;
            }
            else if(c[i] == ' '){
                  if(c[i - 1] != ' ') {
                        s[d] = c[i];
                        d++;
                  }
                  else continue;
            }
      }
}
///---------------------------
int word(char c[])
{
      int d = 0;
      re(i, 0, strlen(c))
            if (c[i] == ' ' && c[i + 1] != ' ')
                  d++;
      return d;
}
///---------------------------
signed main(){
      char a[MMAX], b[MMAX];
      nhap(a);
      out(a);
      pr("Size of string: %d\n", length(a));
      change(a);
      pr("Trim left spaces of the String: ");
      trimleft(a);
      out(a);
      pr("Trim right spaces of the String: ");
      trimright(a);
      out(a);
      pr("Trim all spaces of the String: ");
      trimall(a, b);
      out(b);
      pr("Number of word: %d", word(b));
}
