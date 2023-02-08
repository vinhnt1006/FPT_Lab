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
void swapchar(char* a, char* b){ char c[MMAX]; strcpy(c,a); strcpy(a, b); strcpy(b, c);}
///---------------------------
void inp(char codes[][9], char names[][21], int prices[], char categories[][13], int n){
      re(i, 0, n - 1) {
            fflush(stdin);
            pr("\nINPUT CODE: ");
            gets(codes[i]);
            pr("\nINPUT NAME: ");
            gets(names[i]);
            pr("\nINPUT PRICES: ");
            sc("%d", &prices[i]);
            fflush(stdin);
            pr("\nINPUT CATEGORIES: ");
            gets(categories[i]);
      }
}
///---------------------------
void out(char codes[][9], char names[][21], int prices[], char categories[][13], int n){
      re(i, 0, n - 1) {
            pr("ID: %s\nName: %s\n", codes[i], names[i]);
            pr("PRICES = %d\nCATEGORIES = %s\n", prices[i], categories[i]);
            pu;
      }
}
///---------------------------
void finditem(char req[], char codes[][9], char names[][21], int prices[], char categories[][13], int n){
      re(i, 0, n - 1){
            if(strcmp(codes[i], req) == 0){
                  pr("ID: %s\nName: %s\n", codes[i], names[i]);
                  pr("PRICES = %d\nCATEGORIES = %s\n", prices[i], categories[i]);
            }
      }
}
///---------------------------
int removeitem(int id, char codes[][9], char names[][21], int prices[], char categories[][13], int n){
      if(id < n){
            re(i, id, n){
                  strcpy(codes[id], codes[id + 1]);
                  strcpy(names[id], names[id + 1]);
                  prices[id] = prices[id + 1];
                  strcpy(categories[id], categories[id + 1]);
            }
            n--;
      }
      return n;
}
///---------------------------
void sortitem(char codes[][9], char names[][21], int prices[], char categories[][13], int n){
      re(i, 0, n - 1){
            for(int j = n - 1; j > i; j --){
                  int ctg = strcmp(categories[j], categories[j - 1]);
                  int nm = strcmp(names[j], names[j - 1]);
                  printf("%d %d\n", ctg, nm);
                  if(ctg < 0 || (ctg == 0 && nm < 0)){
                        swapchar(codes[j], codes[j - 1]);
                        swapchar(names[j], names[j - 1]);
                        int c = prices[j];
                        prices[j] = prices[j - 1];
                        prices[j - 1] = c;
                        swapchar(categories[j], categories[j - 1]);
                  }
            }
      }
}
///---------------------------
signed main(){
      char codes[MMAX][9], names[MMAX][21], categories[MMAX][13];
      int prices[MMAX];
      int n, choices;
      pr("Num of Items = ");
      sc("%d", &n);
      pr("1. Input Items\n");
      pr("2. Display Items\n");
      pr("3. Find Items by names\n");
      pr("4. Remove Items by codes\n");
      pr("5. Sort Items by codes and names\n");
      pr("Others. End\n");
      pu;
      do{
            pr("\nChoices: ");
            sc("%d", &choices);
            switch(choices){
                  case 1:
                        inp(codes, names, prices, categories, n);
                        break;
                  case 2:
                        out(codes, names, prices, categories, n);
                        break;
                  case 3:{
                        char req[21];
                        pr("\nINPUT REQUEST: ");
                        fflush(stdin);
                        gets(req);
                        finditem(req, codes, names, prices, categories, n);
                        break;
                  }
                  case 4:{
                        int id;
                        pr("\nINPUT ID: ");
                        sc("%d", &id);
                        pu;
                        n = removeitem(id, codes, names, prices, categories, n);
                        pr("%d\n", n);
                        out(codes, names, prices, categories, n);
                        break;
                  }
                  case 5:{
                        sortitem(codes, names, prices, categories, n);
                        out(codes, names, prices, categories, n);
                        break;
                  }
            }
      }while(choices<=5);
      pr("\nEND.");
}
