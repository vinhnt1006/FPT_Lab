/**
 *    author:  vinhntse160258
 *    created: 15.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
#define pi 3.1415926535897932384
#define INF 1<<30
#define u64 unsigned long
///---------------------------
typedef long int li;
typedef long long int lli;
typedef unsigned long long ull;
typedef long double ld;
const int LIM = 1e5 + 1;
const int MMAX = 1e2 + 1;
///---------------------------
#define pr printf
#define sc scanf
#define pu puts("")
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
#define rt(x) return x
///---------------------------
int random(int minN, int maxN){
    rt(minN + rand() % (maxN + 1 - minN));
}
///---------------------------
void input(int a[], int n){
      re(i, 0, n - 1){
            sc("%d", &a[i]);
      }
}
///---------------------------
void output(int a[], int n){
      re(i, 0, n - 1){
            pr("%d ", a[i]);
      }
      pu;
}
///---------------------------
int findK(int a[], int n, int k){
      re(i, 0, n - 1){
            if (a[i] == k){
                  rt(++ i);
            }
      }
      rt(-1);
}
///---------------------------
void findAll1(int a[], int n, int b[], int d, int k){
      pr("Location of all K = ");
      re(i, 0, n - 1){
            if (a[i] == k) {
                  d ++;
                  b[d] = i + 1;
            }
      }
      if(d == 0) pr("NULL");
      else{
            re(i, 1, d){
                  pr("%d ", b[i]);
            }
      }
      pu;
}
///---------------------------
int* findAll2(int a[], int n, int k, int d){
      int* q = (int*)calloc(n, sizeof(n));
      re(i, 0, n - 1){
            if (a[i] == k) {
                  q[d] = (i + 1);
                  d++;
            }
      }
      if(d == 0)
            rt(-1);
      else
            rt(q);
}
///---------------------------
int sum(int a[], int n){
      int s = 0;
      re(i, 0, n - 1){
            s += *(a + i);
      }
      rt(s);
}
///---------------------------
double avg(int a[], int n){
      rt((1.00 * sum(a, n)) / n);
}
///---------------------------
int max(int a[], int n){
      int qq = INT_MIN;
      re(i, 0, n - 1) {
            qq = (qq < *(a + i) ? *(a + i) : qq);
      }
      rt(qq);
}
///---------------------------
int min(int a[], int n){
      int qq1 = INT_MAX;
      re(i, 0, n - 1) {
            qq1 = (qq1 > *(a + i) ? *(a + i) : qq1);
      }
      rt(qq1);
}
///---------------------------
void outK(int *q, int n){
      pr("Location of all K = ");
      int d = 0;
      re(i, 0, n - 1) {
            if(q[i] != 0) {
                  pr("%d ", q[i]);
                  d ++;
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
int sumeven(int a[], int n){
      int s = 0;
      re(i, 0, n - 1) {
            s += !(a[i] & 1) ? a[i] : 0;
      }
      rt(s);
}
///---------------------------
void outodd(int a[], int n){
      pr("Odd values: ");
      int d = 0;
      re(i, 0, n - 1) {
            if(a[i] & 1) {
                  pr("%d ", a[i]);
                  d ++;
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
int sumodd(int a[], int n){
      int s = 0;
      re(i, 0, n - 1) {
            if(a[i] & 1) {
                  s += a[i];
            }
      }
      rt(s);
}
///---------------------------
int first_even_location(int a[], int n){
      int d = 0;
      re(i, 0, n - 1){
            if(a[i] != 0 && !(a[i] & 1)) {
                  d ++;
                  rt(i);
            }
      }
      rt(-1);
}
///---------------------------
void locations_even(int a[], int n){
      pr("All locations of the even value: ");
      int d = 0;
      re(i, 0, n - 1){
            if(!(a[i] & 1)) {
                  pr("%d ", i);
                  d ++;
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
int min_location(int a[], int n){
      int qq1 = INT_MAX, vt2 = -1;
      re(i, 0, n - 1) {
            if(qq1 > a[i]) {
                  qq1 = a[i];
                  vt2 = i + 1;
            }
      }
      rt(vt2);
}
///---------------------------
int max_location(int a[], int n){
      int qq = INT_MIN, vt1 = -1;
      re(i, 0, n - 1) {
            if(qq < a[i]) {
                  qq = a[i];
                  vt1 = i + 1;
            }
      }
      rt(vt1);
}
///---------------------------
void Sieve_of_Eratosthenes(int a[], int n){
      puts("Primes number: ");
      bool mark[LIM + 1];
      for (long i = 1; i <= LIM; i += 2) {
            mark[i] = true;
      }
      mark[1] = false;
      mark[2] = true;
      for (long i = 3; i * i <= LIM; i += 2){
            if (mark[i] == true){
                  for (long j = i * i; j <= LIM; j += i) {
                        mark[j] = false;
                  }
            }
      }
      int d = 0;
      re(i, 0, n - 1){
            if(mark[a[i]] == true) {
                  pr("%d ", a[i]);
                  d ++;
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
void inpChar(char c[], int n){
      re(i, 0, n - 1) scanf("%s", &c[i]);
}
///---------------------------
void outChar(char c[], int n){
      pr("Chars: ");
      re(i, 0, n - 1) pr("%c ", c[i]);
      pu;
}
///---------------------------
void vowels(char c[], int n){
      printf("Vowels char: ");
      bool kt[27];
      int d = 0;
      for(auto i = 'a'; i <= 'z'; i ++) kt[i] = false;
      re(i, 0, n - 1){
            c[i] = tolower(c[i]);
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                  if(kt[c[i]] == false){
                        pr("%c ", c[i]);
                        kt[c[i]] = true;
                        d ++;
                  }
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
void digits(char c[], int n){
      printf("Digits char: ");
      int d = 0;
      re(i, 0, n - 1){
            if(isdigit(c[i])) {
                  pr("%c ", c[i]);
                  d ++;
            }
      }
      if(d == 0) pr("NULL");
      pu;
}
///---------------------------
int coutvowels(char c[], int n){
      int d = 0;
      re(i, 0, n - 1){
            c[i] = tolower(c[i]);
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                  d++;
            }
      }
      rt(d);
}
///---------------------------
void change(char c[], int n){
      re(i, 0, n - 1){
            if(c[i] >= 'a' && c[i] <= 'z'){
                  c[i] = c[i] - 32;
                  pr("%c ", c[i]);
            }
            else if(c[i] >= 'A' && c[i] <= 'Z'){
                  pr("%c ", c[i]);
            }
      }
      pu;
}
///---------------------------
void input2D(int a[][LIM], int n, int m){
      re(i, 0, n){
            re(j, 0, m){
                  sc("%d", &a[i][j]);
            }
      }
}
///---------------------------
void output2D(int a[][LIM], int n, int m){
      re(i, 0, n){
            re(j, 0, m){
                  pr(" %d  ", a[i][j]);
            }
            pu;
      }
}
///---------------------------
int sum2D(int a[][LIM], int n, int m){
      int s = 0;
      re(i, 0, n){
            re(j, 0, m){
                  s += a[i][j];
            }
      }
      rt(s);
}
///---------------------------
int min2D(int a[][LIM], int n, int m){
      int s = INT_MAX;
      re(i, 0, n){
            re(j, 0, m){
                  s = (s >= a[i][j] ? a[i][j] : s);
            }
      }
      rt(s);
}
///---------------------------
int max2D(int a[][LIM], int n, int m){
      int s = INT_MIN;
      re(i, 0, n){
            re(j, 0, m){
                  s = (s <= a[i][j] ? a[i][j] : s);
            }
      }
      rt(s);
}
///---------------------------
void odd_values2D(int a[][LIM], int n, int m){
      pr("Odd values = ");
      re(i, 0, n){
            re(j, 0, m){
                  if(a[i][j] & 1) {
                        pr("%d ", a[i][j]);
                  }
            }
      }
      pu;
}
///---------------------------
void Sieve_of_Eratosthenes2D(int a[][LIM], int n, int m){
      puts("Primes number: ");
      bool mark[LIM + 1];
      for (long i = 1; i <= LIM; i += 2) {
            mark[i] = true;
      }
      mark[1] = false;
      mark[2] = true;
      for (long i = 3; i * i <= LIM; i += 2){
            if (mark[i] == true){
                  for (long j = i * i; j <= LIM; j += i) {
                        mark[j]=false;
                  }
            }
      }
      int d = 0;
      re(i, 0, n){
            re(j, 0, m){
                  if(mark[a[i][j]] == true) {
                        pr("%d ", a[i][j]);
                        d ++;
                  }
            }
      }
      if(d == 0) pr("NULL");
}
///---------------------------
signed main(){
      srand((int)time(0));
      int limit_min, limit_max;
      pr("Random N from value ");
      sc("%d", &limit_min);
      pr("to value ");
      sc("%d", &limit_max);
      int n = random(limit_min,limit_max);
      pr("n = %d\n", n);
      int k;
      int a[LIM], b[LIM];
      char c[MMAX];
      int p, q;
      int A[MMAX][MMAX];
      input(a, n);
      output(a, n);
      pr("K = ");
      sc("%d", &k);
      pr("First location of K = %d\n", findK(a, n, k));
      findAll1(a, n, b, 0, k);
      outK(findAll2(a, n, k, (int)0), n);
      outodd(a, n);
      pr("Even sum = %d\n", sumeven(a, n));
      pr("Odd sum =  %d\n", sumodd(a, n));
      pr("First location of even value is %d\n", first_even_location(a, n));
      locations_even(a, n);
      pr("Min location = %d\n",  min_location(a, n));
      pr("Max location = %d\n",  max_location(a, n));
      Sieve_of_Eratosthenes(a, n);
      pr("Sum = %d\n", sum(a, n));
      pr("AVG = %.6f\n", avg(a,n));
      pr("Max = %d\nMin = %d\n",  max(a, n), min(a, n));
      pr("\nInput char:\n");
      inpChar(c, n);
      outChar(c, n);
      vowels(c, n);
      digits(c, n);
      pr("Num of Vowels char: %d\n", coutvowels(c, n));
      change(c, n);
      pr("\nInput 2D array:\n");
      pr("Columns = ");
      sc("%d", &p);
      pr("Rows = ");
      sc("%d", &q);
      q--; p--;
      input2D(a, p, q);
      output2D(a, p, q);
      pr("Sum = %d\n", sum2D(a, p, q));
      pr("Min values = %d\n", min2D(a, p, q));
      pr("Max values = %d\n", max2D(a, p, q));
      odd_values2D(a, p, q);
      Sieve_of_Eratosthenes2D(a, p, q);
}
