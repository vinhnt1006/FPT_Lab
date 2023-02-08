/**
 *    author:  vinhntse160258
 *    created: 11.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
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
const int LIM  = 1e6 + 1;
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
char* inpChar(){
      char* c=(char*)calloc(LIM, sizeof(char));
      for(int i = 0; ; i ++){
            scanf("%s", &c[i]);
            if(c[i] == '0') return c;
      }
}
///---------------------------
void outChar(char* c){
      pr("Chars: ");
      for(int i = 0; ; i ++)
            if(c[i] != '0') pr("%c ", c[i]);
            else {puts("0"); return;}
}
///---------------------------
void vowels(char* c){
      printf("Vowels char: ");
      int kt[27];
      for(auto i = 'a'; i <= 'z'; i ++) kt[i] = 0;
      for(int i = 0; ; i ++){
            c[i] = tolower(c[i]);
            if(c[i] == '0') {puts(""); return;}
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                  if(kt[c[i]] == 0){
                        pr("%c ", c[i]);
                        kt[c[i]] = 1;
                  }
            }
      }
}
///---------------------------
void digits(char* c){
      printf("Digits char: ");
      for(int i = 0; ; i ++){
            if(isdigit(c[i])) pr("%c ", c[i]);
            if(c[i] == '0') {puts(""); return;}
      }
}
///---------------------------
int coutvowels(char* c){
      int d = 0;
      for(int i = 0; ; i ++){
            c[i] = tolower(c[i]);
            if(c[i] == '0') return d;
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') d++;
      }
}
///---------------------------
void change(char* c){
      for(int i = 0; ; i++){
            if(c[i] == '0') {puts("0"); return;}
            c[i] = toupper(c[i]);
            pr("%c ", c[i]);
      }
}
///---------------------------
signed main(){
      char* p=inpChar();
      outChar(p);
      vowels(p);
      digits(p);
      printf("Num of Vowels char: %d\n", coutvowels(p));
      change(p);
}
/**
h u m p t y d u m p t y s a t o n t h e w a l l 1 0
**/
