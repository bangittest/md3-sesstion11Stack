package Student;

import config.Config;

import java.util.ArrayList;

import static java.lang.CharSequence.compare;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Nhập số lượng sinh viên cần thêm : ");
        int n = Config.scanner().nextInt();
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputData();
            students.add(student);
        }
        System.out.println("Danh sách sinh viên : ");
        for (Student student : students) {
            student.displayData();
        }
        students.sort((student1, student2) -> compare(student1.getName(), student2.getName()));
        System.out.println("Sắp xếp apha b thành công ");
        for (Student student : students) {
            student.displayData();
        }
    }
}



