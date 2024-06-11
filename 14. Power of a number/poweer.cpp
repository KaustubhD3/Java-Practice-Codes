#include<iostream>
using namespace std;
static int cubeof(int a,int b){
    int power=1;
    for(int i=1;i<=b;i++){
        power=power*a;
    }
    return power;
}
int main(){
        int a,b;
        cin>>a>>b;
        int d=cubeof(a,b);
        cout<<d<<endl;
    }