#include<iostream>
using namespace std;
int main()
{
    int s,t,m,n,a,b,A[100001],B[100001],i,c=0,k=0;
    cin>>s>>t;
    cin>>a>>b;
    cin>>m>>n;
    for(i=0;i<m;i++)
    {
        cin>>A[i];
        A[i]+=a;
        if(A[i]>=s&&A[i]<=t)
        {
            c++;
        }
    }
    for(i=0;i<n;i++)
    {
        cin>>B[i];
        B[i]+=b;
        if(B[i]>=s&&B[i]<=t)
        {
            k++;
        }
    }
    cout<<c<<endl<<k;
    return 0;
    
}
