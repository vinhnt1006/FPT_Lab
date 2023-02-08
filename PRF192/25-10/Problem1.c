/**
 *    author:  vinhntse160258
 *    created: 25.10.2021
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
const int MMAX = 50;
///---------------------------
#define pr printf
#define sc scanf
#define pu puts("")
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
#define rt(x) return x
///---------------------------
void inp(char codes[][9], char names[][21], double salaries[], double allowances[], int n){
      re(i, 0, n - 1) {
            fflush(stdin);
            pr("\nINPUT CODE: ");
            gets(codes[i]);
            pr("\nINPUT NAME: ");
            gets(names[i]);
            pr("\nINPUT SALARIES: ");
            sc("%lf", &salaries[i]);
            pr("\nINPUT ALLOWANCES: ");
            sc("%lf", &allowances[i]);
      }
}
///---------------------------
void out(char codes[][9], char names[][21], double salaries[], double allowances[], int n){
      re(i, 0, n - 1) {
            pr("ID: %s\nName: %s\n", codes[i], names[i]);
            pr("SALARIES = %.2lf\nALLOWANCES = %.2lf\n", salaries[i], allowances[i]);
            pu;
      }
}
///---------------------------
void findstaff(char req[], char codes[][9], char names[][21], double salaries[], double allowances[], int n){
      re(i, 0, n - 1){
            if(strcmp(names[i], req) == 0){
                  pr("ID: %s\nName: %s\n", codes[i], names[i]);
                  pr("SALARIES = %.2lf\nALLOWANCES = %.2lf\n", salaries[i], allowances[i]);
            }
      }
}
///---------------------------
int removestaff(char id[], char codes[][9], char names[][21], double salaries[], double allowances[], int n){
      int vt = -1;
      re(i, 0, n - 1){
            if(strcmp(codes[i], id) == 0){
                  vt = i;
                  break;
            }
      }
      if(vt < n && vt != -1){
            re(i, vt, n){
                  strcpy(codes[vt], codes[vt + 1]);
                  strcpy(names[vt], names[vt + 1]);
                  salaries[vt] = salaries[vt + 1];
                  allowances[vt] = allowances[vt + 1];
            }
            n--;
      }
      return n;
}
///---------------------------
///---------------------------
signed main(){
      char codes[MMAX][9], names[MMAX][21];
      double salaries[MMAX], allowances[MMAX];
      int n, choices;
      pr("Num of Staffs = ");
      sc("%d", &n);
      pr("1. Input Staffs\n");
      pr("2. Display Staffs\n");
      pr("3. Find staff by name\n");
      pr("4. Remove staff by code\n");
      pr("Others. End\n");
      pu;
      do{
            pr("\nChoices: ");
            sc("%d", &choices);
            switch(choices){
                  case 1:
                        inp(codes, names, salaries, allowances, n);
                        break;
                  case 2:
                        out(codes, names, salaries, allowances, n);
                        break;
                  case 3:{
                        char req[21];
                        pr("\nINPUT REQUEST: ");
                        fflush(stdin);
                        gets(req);
                        findstaff(req, codes, names, salaries, allowances, n);
                        break;
                  }
                  case 4:{
                        char id[21];
                        pr("\nINPUT ID: ");
                        fflush(stdin);
                        gets(id);
                        pu;
                        n = removestaff(id, codes, names, salaries, allowances, n);
                        pr("%d\n", n);
                        out(codes, names, salaries, allowances, n);
                        break;
                  }
            }
      }while(choices<=4);
      pr("\nEND.");
}
