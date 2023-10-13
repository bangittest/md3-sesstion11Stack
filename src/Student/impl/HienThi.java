package Student.impl;

import java.util.Stack;

public class HienThi {
    public static void hienThi(Stack<Student> students) {
        if (students.isEmpty()){
            System.out.println("danh sach trong");
        }else {
            System.out.println("danh sach hs");
            for (Student student : students) {
                student.displayData();
            }
        }
    }
}
