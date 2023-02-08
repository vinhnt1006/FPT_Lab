/**
 *    author:  vinhntse160258
 *    created: 15.09.2021
**/
///----------------------------------------------
#include<stdio.h>
///---------------------------------------------- bai 7 ----------------------------------------------///
int n;
///----------------------------------------------
void tg1(){
      for (int i = 1; i < n; i ++) {
            for (int j = 1; j <= i; j ++)  printf((j == 1 || j == i)? "*": " ");
            puts("");
      }
      for (int i = 1; i <= n; i ++) printf("*");
      puts(""); puts("");
}
///----------------------------------------------
void tg2(){
      for (int i = 1; i < n; i ++) {
            for (int j = 1; j <= i * 2 - 1; j ++)  printf((j == 1 || j == i * 2 - 1)? "*": " ");
            puts("");
      }
      for (int i = 1; i <= 2 * n - 1; i ++) printf("*");
}
///----------------------------------------------
int main(){
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      printf("Tam giac vuong rong do cao n:\n");
      tg1();
      tg2();

}
