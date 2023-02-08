/**
 *    author:  vinhntse160258
 *    created: 20.09.2021
**/
///---------------------------
#include<stdio.h>
///10^12
///---------------------------
int mark[10000005];
long a,b;
///---------------------------
#define max(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _a : _b; })
#define min(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _b : _a; })
///---------------------------
void prime(){
      for (long i=1; i<=max(a,b); i+=2) mark[i]=1;
      mark[1]=0;
      mark[2]=1;
      for (long i=3; i*i<=max(a,b); i+=2)
            if (mark[i]==1)
                  for (long j=i*i; j<=max(a,b); j+=i) mark[j]=0;
      printf("Prime number in [a;b] (b-a<=10^7):\n");
      for (long i=min(a,b); i<=max(a,b); i++)
            if (mark[i]==1)  printf("%d ", i);
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
      for (long i=min(a,b); i<=max(a,b); i++){
            if((int)sqrt(i)*(int)sqrt(i)==i) printf("%d ", i);
      }
}
///---------------------------
int main()
{
      scanf("%d%d", &a,&b);
      prime();
      avg();
      square();
}
