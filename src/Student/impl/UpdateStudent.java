package Student.impl;

import Student.impl.Student;
import config.Config;

import java.util.Stack;

public class UpdateStudent {
    public static void updateStudent(Stack<Student> students) {
        if (students.isEmpty()){
            System.out.println("danh sach trong");
        }else {
            System.out.println("nhap id can sua");
            int idUpdate= Config.scanner().nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId()==idUpdate){
                    students.get(i).inputData();
                    System.out.println("sua thanh cong");
                    break;
                }else {
                    System.out.println("k co id " +idUpdate);
                }
            }
        }
    }
}
