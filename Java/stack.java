import java.util.*;
class stack
{
int top=-1;
int x[]=new int [5];

void push()
{
int n;
if(top==4)
System.out.print("Stack is full");
else
{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
top++;
x[top]=n;
}
}


void pop()
{

if(top==-1)
System.out.print("Stack is empty");
else
{
System.out.print("Removing data :"+x[top]);
top--;
}
}

void display()
{
for(int i=top;i>=0;i--)
System.out.println(x[i]);
}



}


class aa
{
public static void main(String args[])
{
stack ob=new stack();
int sw;
Scanner sc=new Scanner(System.in);
while(1>0)
{

System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
System.out.println("Any other:Exit");

System.out.print("enter your choice ");
sw=sc.nextInt();
switch(sw)
{
case 1:
ob.push();
break;
case 2:
ob.pop();
break;
case 3:
ob.display();
break;
default:
System.exit(0);
}
}
}
}
