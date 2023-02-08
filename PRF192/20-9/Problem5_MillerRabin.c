/**
 *    author:  vinhntse160258
 *    created: 20.09.2021
**/
///--------------------------- 2^63-1
#include<stdio.h>
#define INF 1<<30
#define maxn 1000000007
#define u64 unsigned long
///---------------------------
u64 a,b;
///---------------------------
#define max(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _a : _b; })
#define min(a,b) ({ __typeof__ (a) _a = (a); __typeof__ (b) _b = (b); _a > _b ? _b : _a; })
///---------------------------
u64 binpower(u64 base, u64 e, u64 mod)
{
      u64 result = 1;
      base %= mod;
      while(e){
            if(e & 1) result = (u64) result * base % mod;
            base = (u64) base * base % mod;
            e >>= 1;
      }
      return result;
}
///---------------------------
int check_compsite(u64 n, u64 a,u64 d,  int s)
{
      u64 x = binpower(a, d, n);
      if(x == 1 || x == n - 1) return 0;
      for(int r = 1; r < s; r++){
            x = (u64)x * x % n;
            if(x == n - 1) return 0;
      }
      return 1;
};
///---------------------------
int MillerRabin(u64 n)
{
      if(n < 2) return 0;
      int s = 0;
      u64 d = n - 1;
      while((d & 1) == 0){
            d >>= 1;
            s++;
      }
      int j;
      for(int i = 2; i <= 37; i++) {
            for(j = 2; j <= (i/j); j++)
                  if(!(i%j)) break;
                  if(j > (i/j)) {
                        if(n==i) return 1;
                        if (check_compsite(n, i, d, s)) return 0;
                  }
      }
      return 1;
}
///---------------------------
void prime(){
      printf("So nguyen to a toi b la ");
      for(int i=a; i<=b; i++)
            if(MillerRabin(i)) printf("%d ", i);
      puts("");
}
///---------------------------
void avg(){
      printf("Trung binh tu a toi b la %.2f", (b+a)/2.0);
      puts("");
}
///---------------------------
double squareRoot(int n)
{
      int start = 0, end = n, mid;
      double ans;
      while (start <= end) {
            mid = (start + end) >> 1;
            if (mid * mid == n) {
                  ans = mid;
                  break;
            }
            if (mid * mid < n) {
                  start = mid + 1;
                  ans = mid;
            }
            else  end = mid - 1;
      }
      double increment = 0.1;
      for (int i = 0; i < 6; i++) {
            while (ans * ans <= n) ans += increment;
            ans = ans - increment;
            increment = increment / 10;
      }
      return (long)ans;
}
///---------------------------
void square1(){
      printf("So chinh phuong tu a toi b la ");
      for(int i = a; i <= b; i++){
            if((int)sqrt(i)*(int)sqrt(i)==i) printf("%d ", i);
      }
}
///---------------------------
void square2(){
      printf("So chinh phuong tu a toi b la ");
      for(int i = a; i <= b; i++){
            if(squareRoot(i)*squareRoot(i)==i) printf("%d ", i);
      }
}
///---------------------------
void square3()
{
      printf("So chinh phuong tu a toi b la ");
      int n = ceil(sqrt(a));
      int n2 = n * n;
      n = (n * 2) + 1;
      while ((n2 >= a && n2 <= b)) {
            printf("%d ", n2);
            n2 += n;
            n += 2;
      }
}
///---------------------------
int main()
{
      scanf("%d%d", &a,&b);
      prime();
      avg();
      square1();
}
