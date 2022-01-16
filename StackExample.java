package practicepackage;

class MyStack{
	int MAX=20;		
	int top=-1;
	int data[]=new int[MAX];
		
	public void push(int d){
		data[top+1]=d;
		top=top+1;
	}
	
	public int peek(){
		return data[top+1];
	}
	
	public int pop(){
		int temp=data[top];
		top=top-1;
		return temp;
	}
	public void printValues(){
		for(int i=0;i<=top;i++)
			System.out.println(data[i]);
	}
	
	public boolean isEmpty(){
		return (top==-1);	
	}
	
	public int size(){
		return top+1;
	}
}

public class StackExample {
	public static void main(String[] args) 
	{
		MyStack exampleStack = new MyStack();		
		exampleStack.push(50);
		exampleStack.push(60);
		
		System.out.println(exampleStack.peek());
		System.out.println(exampleStack.pop());	
		
		exampleStack.size();

	}
}
