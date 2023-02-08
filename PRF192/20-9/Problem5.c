/**
 *    author:  vinhntse160258
 *    created:      20.09.2021
**/
///---------------------------
#include <stdio.h>
/// no array
int a,b;
///---------------------------
#define max(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _a : _b; })
#define min(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _b : _a; })
///---------------------------
void prime(){
      printf("So nguyen to a toi b la ");
      int j;
      for(int i = (a==1?a+1:a); i <= b; i++) {
            for(j = 2; j <= (i/j); j++)
                  if(!(i%j)) break;
                  if(j > (i/j)) printf("%d ", i);
      }
      puts("");
}
///---------------------------
void avg(){
      printf("Trung binh tu a toi b la %.2f", (b+a)/2.0);
      puts("");
}
///---------------------------
void square(){
      printf("So chinh phuong tu a toi b la ");
      for(int i = a; i <= b; i++){
            if((int)sqrt(i)*(int)sqrt(i)==i) printf("%d ", i);
      }
}
///---------------------------
int main () {
      scanf("%d%d", &a,&b);
      prime();
      avg();
      square();
}
