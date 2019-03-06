#include<iostream.h>
#include<conio.h>
#include<math.h>
int main(){
	clrscr();
	cout<<"\"Third Year\"";
	int a=15,b=20,c,num,i=1;
	if (!(a^b))
		cout<<"\nEqual";
	else
		cout<<"\nNot equal";
	cout<<"\nEnter range";
	cin>>num;
	//print N without semicolon
	while(cout<<i<<" " && i++<num){}
	//max min without loop and condition
	cout<<"\nMaximum is:"<<((a+b)+abs(a-b))/2;
	//addition without "+"
	cout<<"\n"<<abs(-a-b);
	//divide without using "/"

	getch();
	return 0;
	}