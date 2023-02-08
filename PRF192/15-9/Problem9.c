/**
 *    author:  vinhntse160258
 *    created: 15.09.2021
**/
///----------------------------------------------
#include<stdio.h>
///---------------------------------------------- bai 1 ----------------------------------------------///
void bai1(){
      int s=1;
      for(int i = 1; i <= 10; i ++) s *= i;
      printf("S = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = %d\n", s);
}
///---------------------------------------------- bai 2 ----------------------------------------------///
void bai2(){
      int n;
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      unsigned long s = 1;
      for(int i = 1; i <= n; i ++) s *= i;
      printf("S = 1 * 2 * 3 ... * n = %ld\n", s);
}
///---------------------------------------------- bai 3 ----------------------------------------------///
void bai3(){
      int n;
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      unsigned long s = 0;
      for(int i = 1; i <= n; i ++) s += (i & 1 ? i : 0);
      printf("S = 1 + 3 + 5 + ... + n = %ld\n", s);
}
///---------------------------------------------- bai 4 ----------------------------------------------///
void bai4(){
      int n;
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      unsigned long s = 0;
      for(int i = 1; i <= n; i ++) s += (i & 1 ? i * (-1) : i);
      printf("S = -1 + 2 - 3 + 4 - 5 + ... + n = %ld\n", s);
      //printf("S = -1 + 2 - 3 + 4 - 5 + ... + n = %ld\n", (n % 2 == 0 ? n / 2 : (n + 1) / 2 * -1));
}
///---------------------------------------------- bai 5 ----------------------------------------------///
void bai5(){
      int year;
      double balance;
      float rate;
      printf("Year = ");
      scanf("%d", &year);
      printf("Balance = ");
      scanf("%lf", &balance);
      printf("Rate = ");
      scanf("%f", &rate);
      printf("\nYear                 Balance                    Rate\n");
      for(int i = 1; i <= year; i ++){
            balance = balance * (1.0 + rate / 100.0);
            printf("%d                    %.3lf                    %.3lf\n", i, balance, rate);
      }
}
///---------------------------------------------- bai 6 ----------------------------------------------///
void bai6(){
      int n;
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      printf("Tam giac vuong do cao n:\n");
      for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) printf("*");
            puts("");
      }
}
///---------------------------------------------- bai 7 ----------------------------------------------///
void bai7(){
      int n;
      printf("Nhap mot so nguyen n: ");
      scanf("%d", &n);
      printf("Tam giac vuong rong do cao n:\n");
      for (int i = 1; i < n; i ++) {
            for (int j = 1; j <= i; j ++)  printf((j == 1 || j == i)? "*": " ");
            puts("");
      }
      for (int i = 1; i <= n; i ++) printf("*");
      puts(""); puts("");
      for (int i = 1; i < n; i ++) {
            for (int j = 1; j <= i * 2 - 1; j ++)  printf((j == 1 || j == i * 2 - 1)? "*": " ");
            puts("");
      }
      for (int i = 1; i <= 2 * n - 1; i ++) printf("*");
}
///---------------------------------------------- bai 8 ----------------------------------------------///
void bai8(){
      int ngay, thang, nam, s = 0;
      printf("Ngay = ");
      scanf("%d", &ngay);
      printf("Thang = ");
      scanf("%d", &thang);
      printf("Nam = ");
      scanf("%d", &nam);
      printf("So ngay tinh tu 1/1/2000 den %d/%d/%d la ", ngay, thang, nam);
      for(int i = 2000; i < nam; i ++){
            if(((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) s += 366;
            else s += 365;
      }
      for(int i = 1; i < thang; i ++){
            if(i == 1) s += 31;
            else if(i == 2) s += (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0) ? 29 : 28);
            else if(i == 3) s += 31;
            else if(i == 4) s += 30;
            else if(i == 5) s += 31;
            else if(i == 6) s += 30;
            else if(i == 7) s += 31;
            else if(i == 8) s += 31;
            else if(i == 9) s += 30;
            else if(i == 10) s += 31;
            else if(i == 11) s += 30;
            else if(i == 12) s += 31;
      }
      printf("%d", s + ngay - 1);
}
///---------------------------------------------- bai 9 - Menu ----------------------------------------------///
void bai9(){
      int t;
      printf("Yeu cau tinh toan bai so: ");
      while(scanf("%d", &t)){
            puts("");
            switch(t){
                  case 1:
                        bai1();
                        break;
                  case 2:
                        bai2();
                        break;
                  case 3:
                        bai3();
                        break;
                  case 4:
                        bai4();
                        break;
                  case 5:
                        bai5();
                        break;
                  case 6:
                        bai6();
                        break;
                  case 7:
                        bai7();
                        break;
                  case 8:
                        bai8();
                        break;
                  default:
                        printf("Invalid");
            }
            puts("");
            printf("Continue? ");
            char c;
            scanf(" %c", &c);
            if(c == 'N'){
                  puts("Goodbye. Have a good day");
                  return 0;
            }
            else printf("Yeu cau tinh toan bai so: ");
      }
}
///---------------------------------------------- prepare ----------------------------------------------///
void prepare(){
      for(int i = 1; i <= 8; i ++) {
            printf("%d. bai %d\n", i,i);
            if(i == 1) printf("          Calculate S = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10\n");
            else if(i == 2) printf("          Calculate S = 1 * 2 * 3 ... * n\n");
            else if(i == 3) printf("          Calculate S = 1 + 3 + 5 + ... + n\n");
            else if(i == 4) printf("          Calculate S = -1 + 2 - 3 + 4 - 5 + ... + n\n");
            else if(i == 5) printf("          Calculate the balance each year with rate\n");
            else if(i == 6) printf("          Print square triangle with height N\n");
            else if(i == 7) printf("          Print a hollow square triangle of height N\n");
            else if(i == 8) printf("          Count number of days from 1/1/2000\n");
      }
}
int main(){
      prepare();
      puts("");
      bai9();
}
