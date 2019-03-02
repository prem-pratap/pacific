#include<stdio.h>
#include<conio.h>
void main(){
	
	int n,M,i,loc,rem,final=0;
	float nap[20],rat[20],wt[20],pr[20],max;
	printf("Enter no. of items:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("\nEnter weight of item %d:",i+1);
		scanf("%d",&wt[i]);
		printf("\nEnter profit of item %d:",i+1);
		scanf("%d",&pr[i]);	
	}
	for(i=0;i<n;i++){
		rat[i]=pr[i]/wt[i];
	}
	printf("\nEnter maximum capacity:");
	scanf("%d",&M);
	max=rat[0];
	for (i=1;i<n;i++){
		if (rat[i]> max)
			max=rat[i];
			loc=i+1;
			rat[i]=-1;
			if(wt[loc]<=M){
				M=M-wt[loc];
				nap[loc]=1;
			}
			else{
				nap[loc]=M/wt[loc];
				M=M-nap[loc];}	
	}
	for(i=0;i<n;i++){
		//final=nap[i]*pr[i]+final;
		printf("%d ",nap[i]);	}
	printf("\n%d",final);
	getch();
	
}

