#include <iostream>
using namespace std;

int main() {
    int n,step,item;
    cout << " enter the array size ";
    cin >> n;
    
    int* a = new int[n]; 
    
    cout << " enter array element ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 1; i < n; i++)
    {
        int temp=a[i];
       int j=i-1;
       while (j>=0 && a[j]>temp)
       {
        a[j+1]=a[j];



        j--;
       }
       a[j+1]=temp;
       
    }
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    
    
    
    }
      