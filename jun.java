package jan4;



//_____________________[stack]_______________________________________________***

class Stack{
	
	int max=5;
	int top=-1;
	
	int[] stack=new int[max];
	
	boolean isempty() {
		return (top<0);
	}
	
	public void push(int x) {
		if(top==max-1) {
			System.out.println("stack is full");
		
		}else {
			stack[++top]=x;
			System.out.println(x+"  pushed element");
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			
		}else {
			int x=stack[top--];
			System.out.println(x+ "  pop element");
			
			
	
		}
		
	}
	public void peak() {
		if(top<0) {
			System.out.println("stack is empty");
		}else {
			int x=stack[top];
			System.out.println(x +"  peak element");
			
		}
		
	}
	
	void display() {
		for(int i=top;i>-1;i--) {
			System.out.println(stack[i]);
		}
		
		
	}
	

	
}
public class jun {
	public static void main(String[] args) {
		
		Stack obj=new Stack();
		
		obj.push(5);
		obj.push(76);
		obj.push(51);
		obj.push(52);
		obj.push(12);
		
		obj.pop();
		obj.pop();
		
		obj.peak();
		
		obj.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
