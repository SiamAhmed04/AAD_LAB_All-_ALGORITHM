#include<iostream>
using namespace std;

void maxheapify(int a[], int n, int i) {
    int largest = i;
    int left = 2 * i;
    int right = 2 * i + 1;

    if (left <= n && a[left] > a[largest]) {
        largest = left;
    }
    if (right <= n && a[right] > a[largest]) {  
        largest = right;
    }
    if (largest != i) {  
        int temp = a[largest];
        a[largest] = a[i];
        a[i] = temp;
        maxheapify(a, n, largest);

    } 
}

void buildmaxheap(int a[], int n) {
    for (int i = n / 2; i >= 1; i--) {
        maxheapify(a, n, i);
    }
}

void heapSort(int a[], int n) {
    buildmaxheap(a, n);
    for (int i = n; i > 1; i--) {
        int temp = a[i];
        a[i] = a[1];
        a[1] = temp;
        maxheapify(a, i - 1, 1);
    }
}

int main() {
    int n;
    cout << "enter the size of array: ";
    cin >> n;
    int* a = new int[n + 1]; 
    cout << "enter the elements of array: ";
    a[0] = 0;
    for (int i = 1; i <= n; i++) { 
        cin >> a[i];
    }
    heapSort(a, n);
    for (int i = 1; i <= n; i++) { 
        cout << a[i] << " ";
    }
    delete[] a; 
}
