package bai1;

import java.util.LinkedList;
import java.util.Queue;

public class B1 {
    public static void main(String[] args) {
        //tao 1 danh sach dau vao
        String[]inputList={"A","B","C","D","E","F","G","H","I","J"};
        Queue<String>queue=new LinkedList<>();

        //dua cac phan tu danh sach dau vafo vao queue
        for (String e:
             inputList) {
            queue.add(e);
        }
        //in ra cac phan tu tu queue va loai bo chung khoi queue

        while (!queue.isEmpty()){
            String e=queue.poll();
            System.out.println("phan tu " +e);
        }
    }
}
