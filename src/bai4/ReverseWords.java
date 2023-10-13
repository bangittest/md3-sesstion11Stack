package bai4;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Tạo một stack để lưu trữ từ
        Stack<String> wordStack = new Stack<>();

        // Nhập số lượng từ từ người dùng
        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới (dấu xuống dòng)

        //  Nhập từng từ và đẩy vào stack
        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }

        //  In các từ trong stack ra theo thứ tự đảo ngược
        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordStack.isEmpty()) {
            String word = wordStack.pop();
            System.out.println(word);
        }
        scanner.close();
    }
}
