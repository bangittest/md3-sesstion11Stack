package bai3;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        // Thêm phần tử vào hàng đợi
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        // Lấy ra và in ra các phần tử từ hàng đợi
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
        System.out.println(queue.dequeue()); // 5
        System.out.println(queue.dequeue()); // null, hàng đợi trống
    }
}
