import java.util.PriorityQueue;

public class DemoQueueJava {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        System.out.printf("Poll ra phan tu %s trong queue\n ", queue.poll());
        System.out.printf("Poll ra phan tu %s trong queue\n ", queue.poll());
        System.out.printf("Poll ra phan tu %s trong queue\n ", queue.poll());
        System.out.println("peek cua queue la " +queue.peek());

        System.out.println(queue.isEmpty()?"dang rong":"dang co phan tu");
    }
}
