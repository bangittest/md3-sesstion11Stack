import java.util.Stack;

public class DemoStackJava {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.printf("Pop co gia tri %d ra khoi stack\n ",stack.pop());
        System.out.printf("gia tri o dinh %d\n " ,stack.peek());
        System.out.printf(stack.isEmpty()?"k rong":"rong");
    }
}
