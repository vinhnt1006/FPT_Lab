/**
 *    author:  vinhntse160258
 *    created: 27.10.2021
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
int loadData(char a[], char file[]){
      FILE* f = fopen(file, "r");
      if(f == NULL) return 0;
      int i = 0;
      while(!feof(f)){
            a[i] = fgetc(f);
            i++;
      }
      a[i - 1] = '\0';
      fclose(f);
      return 1;
}
///---------------------------
char* upper(char c[]){
      return strupr(c);
}
///---------------------------
int write(char a[], char file[]){
      FILE* f = fopen(file, "w");
      re(i, 0, strlen(a) - 1) fputc(a[i], f);
      fclose(f);
      return 1;
}
///---------------------------
///---------------------------
///---------------------------
signed main(){
      /*if (fopen("test.inp","r"))
            freopen("test.inp","r",stdin);
      else {
            #define file "thotinh"
            freopen(file".inp","r",stdin);
            freopen(file".out","w",stdout);
      }*/
      char a[MMAX];
      if(loadData(a, "thotinh.txt") == 1) {
                  printf("%s\n", a);
                  if(write(upper(a), "thotinh.txt") == 1) puts("OK");
                  else puts("NO");
      }
      else puts("NODATA");
}
