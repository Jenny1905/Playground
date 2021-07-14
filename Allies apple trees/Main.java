#include <iostream>
using namespace std;

int findPeri(int apples) {
		int sum=0;
		int x[] = {-1,-1,-1,0,0,1,1,1};
		int y[] = {-1,0,1,-1,1,-1,0,1};
		
		for (int i=0;i<8;++i) {
			x[i]<0?(x[i]*=-1):x[i];
			y[i]<0?(y[i]*=-1):y[i];
		}
		int factor=1;
		while(sum<apples) {
			for (int i=0;i<8;++i){
				sum += x[i]+y[i];
			}
			if(sum>=apples) break;
			++factor;
			for (int i=0;i<8;++i) {
				x[i]=factor; y[i]=factor;
			}
		}
	//	cout<<endl<<"Sum:"<<sum;
		return factor<<3;
}

int main() {
	int a; cin>>a;
	int p = findPeri(a);
	cout<<p;
	return 0;
}