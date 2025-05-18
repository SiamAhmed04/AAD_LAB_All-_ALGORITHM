#include <iostream>
using namespace std;

int main() {
    int n,step;
    cout << " enter the array size ";
    cin >> n;
    
    int* a = new int[n]; 
    
    cout << " enter array element ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int step = 1; step < n; step++)
    {
        for (int i = 0; i <n-step; i++)
        {
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        
    }
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    







}