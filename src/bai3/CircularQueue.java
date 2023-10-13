package bai3;

class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            newNode.next = front; // Node rear trỏ đến Node front
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Cập nhật trỏ địa chỉ rear về front
        }
    }

    public Integer dequeue() {
        if (front == null) {
            return null; // Hàng đợi trống, trả về null
        }

        int data = front.data;

        if (front == rear) {
            front = rear = null; // Chỉ còn một phần tử, set front và rear về null
        } else {
            front = front.next; // Di chuyển front tới phần tử tiếp theo
            rear.next = front; // Cập nhật trỏ địa chỉ rear về front mới
        }

        return data;
    }
}