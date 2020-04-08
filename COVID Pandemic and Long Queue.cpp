Question at-->https://www.codechef.com/APRIL20B/problems/COVIDLQ
#include <bits/stdc++.h>
using namespace std;

void solve();

int main()
{int t;
  cin>>t;
  while(t--)solve();
}
void solve()
{
    int n,a;
    cin>>n;
    
    bool flag=true;

    if(n<=6)
    {
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            cin>>a;
            if(!flag) continue;
            if(a==1) cnt++;
            if(cnt>1)
            {
                flag=false;
            }
        }
        
        (flag) ? cout<<"YES\n" : cout<<"NO\n" ;
        return;
    }

    int p=-1;
    for(int i=0;i<n;i++)
    {
        cin>>a;
        if(!flag) continue;
        if(a==1)
        {
            if(p==-1)
            {
                p=i;
            }
            else
            {
                if(i-p<6)
                {
                    flag=false;
                }
                p=i;
            }
        }
    }
    
    flag? cout<<"YES\n" : cout<<"NO\n";
}
