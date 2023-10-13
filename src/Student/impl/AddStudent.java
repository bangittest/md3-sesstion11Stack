
package Student.impl;

import config.Config;
import java.util.Stack;

public class AddStudent {
    public static void addStudent(Stack<Student> students) {
        System.out.println("Nhập số lượng sinh viên muốn thêm:");
        int n = Config.scanner().nextInt();
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputData();
            students.add(student);
        }
        System.out.println("Thêm sinh viên thành công");
    }
}