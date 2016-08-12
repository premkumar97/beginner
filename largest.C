#include<stdio.h>


int main(){
int n,dig,size=0,i,j,temp,ans=0;
int sol[100];
clrscr();
printf("Enter the number");
scanf("%d",&n);
printf("Enter the Value of limit");
scanf("%d",&dig);
for (j = 0;n>0; j++)
{
sol[j]=n%10;
n=n/10;
size++;
}
for(i=0;i<size;i++)
{
for(j=i;j<size;j++)
{
if(sol[i]>sol[j])
{
 temp=sol[j];
 sol[j]=sol[i];
 sol[i]=temp;
}
}
}
for(i=0;i<size-dig;i++)
{
 ans=ans*10+sol[i];
}
printf("%d",ans);
return 0;
}
