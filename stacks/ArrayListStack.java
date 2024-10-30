import java.util.*;
public class ArrayListStack {

    public static class Stack {
        ArrayList<Integer> arrList = new ArrayList<>();

        boolean isEmpty() {
            return arrList.size() == 0;
        }

        void push(int e) {
            arrList.add(e);
        }

        int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = peek();
            arrList.remove(arrList.size()-1);
            return top;
        }

        int peek() {
            if(isEmpty()) {
                return -1;
            }
            return arrList.get(arrList.size()-1);
        }

        void printStack() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = arrList.size()-1; i >= 0; i--) {
                System.out.println("\t"+arrList.get(i));                      
            }
        }
    }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.printStack();
        System.out.println(s.pop()+" is removed from the stack");
        s.printStack();
        System.out.println(s.peek()+" is the top element of stack");
    }
}