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
char* inpChar(){
      char* pt = (char* ) calloc(5, sizeof( int ));
      //scanf("%c%c%c%c%c", pt, pt+1, pt+2, pt+3, pt+4);
      *pt = 'a'; *(pt+1)='b';
      *(pt + 2) = 'c';*(pt + 3) = 'd';
      *(pt + 4) = 'e';
      return pt;
}
///---------------------------
void* outChar(char* pt){
      re(i, 0, 4) pr("%3c\n", *(pt+i));
}
///---------------------------
signed main(){
      //printf("%c", inpChar());
      *outChar(inpChar());
}
