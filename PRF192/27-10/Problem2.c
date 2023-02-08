/**
 *    author:  vinhntse160258
 *    created: 27.10.2021
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
///---------------------------
///---------------------------
///---------------------------
void swap(int* a, int* b)
{
      int t = *a;
      *a = *b;
      *b = t;
}
///---------------------------
int partition(int array[], int low, int high) {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
            i++;
            swap(&array[i], &array[j]);
        }
    }
    swap(&array[i + 1], &array[high]);
    return (i + 1);
}
///---------------------------
void quickSort(int array[], int low, int high) {
    if (low < high) {
        int pi = partition(array, low, high);
        quickSort(array, low, pi - 1);
        quickSort(array, pi + 1, high);
    }
}
///---------------------------
signed main(){
      freopen("2.txt","r",stdin);
      freopen("2.out","w",stdout);
      int a[MMAX];
      int i = 0;
      while(scanf("%d", &a[i]) != EOF){
            quickSort(a, 0, i);
            i++;
      }
      re(j, 0, i - 1) pr("%3d", a[j]);
}
