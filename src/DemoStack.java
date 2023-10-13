import java.util.ArrayList;
import java.util.List;

public class DemoStack {
    public void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.printf("thuc hien ham pop gia trij bi loai bo " +stack.pop());
        System.out.printf("dinh hien tai stack cua minh co gia tri la " +stack.peek());
        stack.pop();
        stack.pop();
        System.out.printf(stack.isEmpty()?"Stack dang rong":"Stack dnag co gia tri");


    }
    class Stack{
        private List<Integer>list=new ArrayList<>();

        public  void push(Integer integer){
            list.add(integer);
        }

        public  Integer pop(){
            Integer peek= list.get(list.size()-1);
            list.remove(peek);
            return peek;
        }


        public Integer peek(){
            return list.get(list.size()-1);
        }

        public boolean isEmpty(){
            return list.isEmpty();
        }

        public boolean isEmpty2(){
            return list.size()==0;
        }
    }

}
