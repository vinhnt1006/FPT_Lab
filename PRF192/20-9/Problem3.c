/**
 *    author:  vinhntse160258
 *    created:      20.09.2021
**/
///---------------------------
#include<stdio.h>
///---------------------------
#define max(a, b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _a : _b; })
#define min(a, b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _b : _a; })
///---------------------------
char a, b;
///---------------------------
void sol(){
      for(auto i = min(a + 1, b - 1) ; i <= max(a + 1, b - 1) ; i ++) printf("Ki tu %c co ma ASCII la %d\n", i, i);
}
///---------------------------
signed main(){
      scanf("%c %c", &a, &b);
      sol();
}
