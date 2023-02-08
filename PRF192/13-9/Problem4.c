/**
 *    author:  vinhntse160258
 *    created:
**/
///---------------------------
#include<stdio.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
#define pi 3.1415926535897932384
///---------------------------
typedef long int li;
typedef long long int lli;
typedef unsigned long long ull;
typedef long double ld;
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
int n;
///---------------------------
void sol(){
       int a = n % 10, b = ((n % 100) - (n % 10)) / 10, c = n / 100;
      if(c == 1) printf("mot");
      else if(c == 2) printf("hai");
      else if(c == 3) printf("ba");
      else if(c == 4) printf("bon");
      else if(c == 5) printf("nam");
      else if(c == 6) printf("sau");
      else if(c == 7) printf("bay");
      else if(c == 8) printf("tam");
      else if(c == 9) printf("chin");
      printf(" tram ");
      if(b == 0) printf(" linh ");
      else if(b == 1) printf("muoi");
      else if(b == 2) printf("hai muoi");
      else if(b == 3) printf("ba muoi");
      else if(b == 4) printf("bon muoi");
      else if(b == 5) printf("nam muoi");
      else if(b == 6) printf("sau muoi");
      else if(b == 7) printf("bay muoi");
      else if(b == 8) printf("tam muoi");
      else if(b == 9) printf("chin muoi");
      if(a == 1) printf(" mot");
      else if(a == 2) printf(" hai");
      else if(a == 3) printf(" ba");
      else if(a == 4) printf(" tu");
      else if(a == 5) {
            if(b==0) printf(" nam");
            else printf(" lam");
      }
      else if(a == 6) printf(" sau");
      else if(a == 7) printf(" bay");
      else if(a == 8) printf(" tam");
      else if(a == 9) printf(" chin");
}
///---------------------------
int main()
{
      int n;
      scanf("%d",&n);
      sol();
}
