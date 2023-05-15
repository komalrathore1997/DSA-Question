package StackQuestion;

public class StackC {
   static final int MAX=1000;
   int top;
   int a[]=new int[MAX];
   boolean isEmpty() {
	   return (top<0);
   }
   StackC(){
	   top=-1;
   }
   
   boolean push(int x) {
	   if(top>(MAX-1)) {
		   System.out.println("Stack Overflow");
		   return false;
	   }else {
		   a[++top]=x;
		   System.out.println(x+"pushed into stack");
		   return true;
	   }
   }
   int pop() {
	   if(top<0) {
		   System.out.println("Stack Underflow");
		   return 0;
	   }else {
		  int  x=a[top--];
		   return x;
	   }
   }
   int peek() {
	  if(top<0) {
		  System.out.println("stack underflow");
		  return 0;
	  }else {
		  int x=a[top];
		  return x;
	  }
   }
   void print() {
	   for(int i=top;i>-1;i--) {
		   System.out.println("array:"+a[i]);
	   }
   }
   public static void main(String[] args) {
	StackC s=new StackC();
	s.push(10);
	s.push(20);
	s.push(30);
	System.out.println(s.pop()+"popped form stack");
	//System.out.println(s.pop()+"popped form stack");
	System.out.println("Top element is:"+s.peek());
	System.out.println("Element present in stack");
	s.print();
}
}
