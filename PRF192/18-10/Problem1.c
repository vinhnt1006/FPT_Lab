/**
 *    author:  vinhntse160258
 *    created: 18.10.2021
**/
///---------------------------
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
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
void inpChar(char c[], int n){
      re(i, 0, n - 1) scanf("%s", &c[i]);
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
int coutconsonants(char c[], int n){
      int d = 0;
      re(i, 0, n - 1){
            c[i] = tolower(c[i]);
            if(c[i] >= 'a' && c[i] <= 'z'){
                  if(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u'){
                        d ++;
                  }
            }
      }
      rt(d);
}
///---------------------------
int location(char c[], int n){
      re(i, 0, n - 1){
            if(c[i] != '\0') rt(i);
      }
      rt(-1);
}
///---------------------------
void swap(char* a, char* b)
{
      char t = *a;
      *a = *b;
      *b = t;
}
///---------------------------
void bubbleSort(char a[], int n)
{
      bool qq;
      re(i, 0, n - 1){
            qq = false;
            re(j, 0, n - i - 1){
                  if (a[j] > a[j + 1] && a[j + 1] != '\0'){
                        swap(&a[j], &a[j+1]);
                        qq = true;
                  }
            }
            if (qq == false) break;
      }

      /*re(i, 0, n - 1){
          re(j, 0, n - i - 1){
                if (a[j] >= a[j + 1] && a[j + 1] != '\0')
                  swap(&a[j], &a[j + 1]);
          }
      }
      */
}
///---------------------------
void selectionSort(char a[], int n){
      int min;
      re(i, 0, n - 1){
		min = i;
		re(j, i + 1, n - 1){
			if (a[min]>a[j]){
				min = j;
			}
		}
		swap(&a[i],&a[min]);
		pu;
		for (int k = 0; k < n; k++){
			if (k == min || k == i) pr("[%c] ",a[k]);
			else pr("%c ",a[k]);
		}
		pu;
	}
}
///---------------------------
int partition(char array[], int low, int high) {
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
void quickSort(char array[], int low, int high) {
    if (low < high) {
        int pi = partition(array, low, high);
        quickSort(array, low, pi - 1);
        quickSort(array, pi + 1, high);
    }
}
///---------------------------
void merge(char a[], int left, int mid, int right)
{
      int n1 = mid - left + 1, n2 =  right - mid;
      char ok1[n1], ok2[n2];
      re(i, 0, n1 - 1) ok1[i] = a[left + i];
      re(i, 0, n2 - 1) ok2[i] = a[mid + i + 1];
      int i = 0, j = 0, k = left;
      while (i < n1 && j < n2){
            if (ok1[i] <= ok2[j]){
                  a[k] = ok1[i];
                  i++;
            }
            else{
                  a[k] = ok2[j];
                  j++;
            }
            k++;
      }
      while (i < n1){
            a[k] = ok1[i];
            i++;
            k++;
      }
      while (j < n2){
            a[k] = ok2[j];
            j++;
            k++;
      }
}
///---------------------------
void mergeSort(char a[], int left, int right)
{
      if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid+1, right);
            merge(a, left, mid, right);
    }
}
///---------------------------
void heap(char a[], int n, int i)
{
      int ok = i, l = 2 * i + 1, r = 2 * i + 2;
      if (l < n && a[l] > a[ok]) ok = l;
      if (r < n && a[r] > a[ok]) ok = r;
      if (ok != i) {
            swap(&a[i], &a[ok]);
            heap(a, n, ok);
      }
}
///---------------------------
void heapSort(char a[], int n)
{
      for (int i = n / 2 - 1; i >= 0; i--) heap(a, n, i);
      for (int i = n - 1; i > 0; i--) {
            swap(&a[0], &a[i]);
            heap(a, i, 0);
      }
}
///---------------------------
void insertionSort(char a[], int n)
{
      int ok, j;
      re(i, 1, n - 1){
            ok = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > ok){
                  a[j + 1] = a[j];
                  j --;
            }
            a[j + 1] = ok;
    }
}
///---------------------------
void outChar(char c[], int n){
      pr("Chars: ");
      re(i, 0, n - 1) pr("%c ", c[i]);
      pu;
}
///---------------------------
signed main(){
      char c[MMAX], a[MMAX], b[MMAX], d[MMAX], e[MMAX], f[MMAX];
      int n;
      pr("N = ");
      sc("%d", &n);
      inpChar(c, n);
      strncpy(a, c, n);
      strncpy(b, c, n);
      strncpy(d, c, n);
      strncpy(e, c, n);
      strncpy(f, c, n);
      outChar(c, n);
      digits(c, n);
      pr("Num of Consonant char: %d\n", coutconsonants(c, n));
      pr("First location of accepted char = %d\n", location(c, n));
      bubbleSort(c, n);
      pr("Bubble Sort: ");
      outChar(c, n);
      pr("Selection Sort: ");
      selectionSort(a, n);
      pr("Quick Sort: ");
      quickSort(b, 0, n - 1);
      outChar(b, n);
      pr("Merge Sort: ");
      mergeSort(d, 0, n - 1);
      outChar(d, n);
      pr("Heap Sort: ");
      heapSort(e, n);
      outChar(e, n);
      pr("Insertion Sort: ");
      insertionSort(f, n);
      outChar(f, n);
}
