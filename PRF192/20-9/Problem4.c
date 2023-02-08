/**
 *    author:  vinhntse160258
 *    created:      20.09.2021
**/
///---------------------------
#include <stdio.h>
/// no array
///---------------------------
int n, j;
///---------------------------
void sol(){
      for(int i = 2; i <= n; i ++) {
            for(j = 2; j <= (i / j); j ++)
                  if(! (i % j)) break;
                  if(j > (i / j)) printf("%d ", i);
      }
}
///---------------------------
int main () {
      scanf("%d", &n);
      printf("So nguyen to 1 toi n la: ");
      sol();
}
