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
      for(int i = 2; i <= 37; i ++) {
            for(j = 2; j <= (i / j); j ++)
                  if(!(i % j)) break;
                  if(j > (i / j)) {
                        if(n == i) return 1;
                        if (check_compsite(n, i, d, s)) return 0;
                  }
      }
      return 1;
}
///---------------------------
void print(int n){
      for(int i = 2; i <= n; i ++)
            if(MillerRabin(i)) printf("%d ", i);
}
///---------------------------
int main()
{
      u64 n;
      scanf("%ld", &n);
      printf("So nguyen to 1 toi n la: ");
      print(n);
}
