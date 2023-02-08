/**
 *    author:  vinhntse160258
 *    created:
**/
///---------------------------
#include<stdio.h>
///---------------------------
void bcc(){
      puts("Bang cuu chuong tu 2 den 9:");
      for(int i = 2; i <= 9; i ++){
            printf("Bang cuu chuong so %d :\n", i);
            for(int j = 1; j <= 10; j ++){
                  printf("%d x %d = %d\n", i, j, i * j);
            }
      }
}
signed main(){
      bcc();
}
