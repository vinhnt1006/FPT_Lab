/**
 *    author:  vinhntse160258
 *    created: 15.09.2021
**/
///----------------------------------------------
#include<stdio.h>
///---------------------------------------------- bai 8 ----------------------------------------------///
int ngay, thang, nam, s = 0;
///----------------------------------------------
void sol(){
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
///----------------------------------------------
int main(){
      printf("Ngay = ");
      scanf("%d", &ngay);
      printf("Thang = ");
      scanf("%d", &thang);
      printf("Nam = ");
      scanf("%d", &nam);
      sol();
}
