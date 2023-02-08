/**
 *    author:  vinhntse160258
 *    created: 05.11.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<string.h>
///---------------------------
#define inf 1072114514
#define llinf 4154118101919364364
#define mod 1000000007
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
float inp1(float a){
      sc("%f", &a);
      return a;
}
///---------------------------
float mmax(float a, float b){
      if(a - b > 0) return a;
      else return b;
}
///---------------------------
void problem1(){
      float n, m;
      pr("Input first number: ");
      n = inp1(n);
      pr("Input second number: ");
      m = inp1(m);
      n = mmax(n, m);
      pr("Max value of two numbers is %.2f", n);
}
///---------------------------
int* inpInt(){
      pr("Input list of array: ");
      int *a = (int*) calloc(LIM, sizeof(long));
      int i = 0;
      while(sc("%d", &a[i])){
            if(a[i] != 0) i ++;
            else goto end;
      }
      end:;
      return a;
}
///---------------------------
void outInt(int* a){
      pr("Values: ");
      for(int i = 0; ; i ++)
            if(a[i] != 0) pr("%d ", a[i]);
            else goto end;
      end:;
      puts("");
}
///---------------------------
int prime_sum(int* a){
      bool mark[LIM + 1];
      int s = 0;
      for (long i = 1; i <= LIM; i += 2) mark[i] = true;
      mark[1] = false;
      mark[2] = true;
      for (long i = 3; i * i <= LIM; i += 2)
            if (mark[i] == true)
                  for (long j = i * i; j <= LIM; j += i) mark[j]=false;
      for(int i = 0; a[i] != 0; i ++){
            if(mark[a[i]] == true)
                  s += a[i];
      }
      return s;
}
///---------------------------
void problem2(){
      int* t=inpInt();
      outInt(t);
      pr("Sum of prime values = %d", prime_sum(t));
}
///---------------------------
void inp3(char s[]){
      pr("Input binary string: ");
      fflush(stdin);
      gets(s);
}
///---------------------------
int h_mu(int a, int b){
      int s = 1;
      re(i, 1, b) s *= a;
      return s;
}
///---------------------------
void solve(char c[]){
      re(i, 0, strlen(c) - 1){
            if(c[i] != '0' && c[i] != '1'){
                  puts("Invalid");
                  return;
            }
      }
      pr("Convert binary to decimal: ");
      int s = 0;
      for(int i = strlen(c) - 1; i >=0; i--)
            if(c[i] == '1') s += h_mu(2, strlen(c) - i - 1);
      pr("%d", s);
}
///---------------------------
void problem3(){
      char a[MMAX];
      inp3(a);
      solve(a);
}
///---------------------------
void problem4(){
      pr("Goodbye\n");
}
///---------------------------
void menu(){
      puts("1. Question 1: Find the largest value of two numbers");
      puts("2. Question 2: Input the list of numbers from the keyboard until input 0. Display and get the sum of prime numbers.");
      puts("3. Question 3: Input the list of numbers that are only 0 or 1. Convert it to the decimal number");
      puts("4. Exit");
      pu;
      int query;
      pr("Input an option: ");
      while(scanf("%d", &query)){
            pu;
            switch(query){
                  case 1:
                        problem1();
                        break;
                  case 2:
                        problem2();
                        break;
                  case 3:
                        problem3();
                        break;
                  case 4:
                        problem4();
                        return;
                  default:
                        puts("Invalid input");
            }
            puts("");
            printf("Continue? ");
            char c;
            scanf(" %c", &c);
            if(c == 'N'){
                  puts("Goodbye. Have a good day");
                  return 0;
            }
            else printf("\nInput an option: ");
      }
}
///---------------------------
signed main(){
      menu();
}
