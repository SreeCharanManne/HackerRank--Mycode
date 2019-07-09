#include <bits/stdc++.h>

using namespace std;

int migratoryBirds(int n, vector <int> ar) {
    
    int f[5];
    for(int i=1;i<=5;i++)
    {
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(ar[j]==i)
            {
                c++;
            }
            f[i-1]=c;
        }
    }
    int max=f[0],loc=0;
    for(int k=1;k<5;k++)
    {
        if(f[k]>max)
        {
            max=f[k];
            loc=k;
        }
        
    }
    return (loc+1);
}

int main() {
    int n;
    cin >> n;
    vector<int> ar(n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       cin >> ar[ar_i];
    }
    int result = migratoryBirds(n, ar);
    cout << result << endl;
    return 0;
}

