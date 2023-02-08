/**
 *    author:  vinhntse160258
 *    created: 06.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
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
const long LIM = 1e5 + 1;
///---------------------------
#define pr printf
#define sc scanf
#define re(i,a,b) for(int i=a;i<=b;i++)
#define I 1e18
///---------------------------
int* inpInt(){
      int *a = (int*) calloc(LIM, sizeof(long));
      int i = 0;
      while(sc("%d", &a[i])){
            if(a[i] != 0) i ++;
            else return a;
      }
}
///---------------------------
void outInt(int* a){
      pr("Values: ");
      for(int i = 0; ; i ++)
            if(a[i] != 0) pr("%d ", a[i]);
            else {puts(""); return;}
}
///---------------------------
int* first_even_location(int* a){
      for(int i = 0; ; i ++)
            if(a[i] != 0 && !(a[i] & 1)) return i;
}
///---------------------------
void locations_even(int* a){
      pr("All locations of the even value: ");
      for(int i = 0; ; i ++){
            if(a[i] == 0) {puts(""); return;}
            if(!(a[i] & 1)) pr("%d ", i);
      }
}
///---------------------------
int odd_sum(int* a){
      int s = 0;
      for(int i = 0; ; i ++){
            if(a[i] == 0) return s;
            if(a[i] & 1) s += a[i];
      }
}
///---------------------------
signed main(){
      int* t=inpInt();
      outInt(t);
      pr("First location of even value is %d\n", first_even_location(t));
      locations_even(t);
      pr("Sum of odd values =  %d", odd_sum(t));
}
