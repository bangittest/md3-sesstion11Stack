package bai5;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi cần kiểm tra:");
            String str = scanner.nextLine();

            if (isPalindrome(str)) {
                System.out.println("Chuỗi là Palindrome");
            } else {
                System.out.println("Chuỗi không phải là Palindrome");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        // Chuyển đổi chuỗi thành chữ thường và loại bỏ các khoảng trắng
        str = str.toLowerCase().replaceAll("\\s", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}