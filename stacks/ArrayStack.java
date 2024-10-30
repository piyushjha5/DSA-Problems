class ArrayStack {

    static class Stack {
        static final int MAX = 1000;
        int top;
        int a[] = new int[MAX]; // Maximum size of Stack

        Stack()
        {
            top = -1;
        }
    
        boolean isEmpty()
        {
            return (top < 0);
        }
           
        boolean push(int x)
        {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            }
            else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }
    
        int pop()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top--];
                return x;
            }
        }
    
        int peek()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                return a[top];
            }
        }
       
        void print(){
        for(int i = top;i>-1;i--){
          System.out.print(" "+ a[i]);
        }
      }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}