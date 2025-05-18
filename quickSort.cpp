#include <iostream>
using namespace std;

int partition(int a[], int low, int high) {
    int pivot = a[low];
    int start = low + 1;
    int end = high;

    while (start <= end) {
        while (start <= end && a[start] <= pivot) {
            start++;
        }
        while (start <= end && a[end] > pivot) {
            end--;
        }
        if (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
    }
    
    int temp = a[low];
    a[low] = a[end];
    a[end] = temp;
    return end;
}

void quickSort(int a[], int low, int high) {
    if (low < high) {
        int pivotIndex = partition(a, low, high);
        quickSort(a, low, pivotIndex - 1);
        quickSort(a, pivotIndex + 1, high);
    }
}

int main() {
    int n;
    cout << " enter the array size ";
    cin >> n;
    
    int* a = new int[n];
    
    cout << " enter array element ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    quickSort(a, 0, n - 1);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }

    delete[] a;
    return 0;
}
