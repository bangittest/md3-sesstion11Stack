package Student.impl;

import config.Config;

import java.util.Stack;

public class DeleteStudent {
    public static void deleteStudent(Stack<Student> students) {
        if (students.isEmpty()){
            System.out.println("ds trong");
        }else {
            System.out.println("nhap id can xoa");
            int idDelete= Config.scanner().nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId()==idDelete){
                    students.remove(i);
                    System.out.println("xoa thanh cong");
                    break;
                }else {
                    System.out.println("k co id " +idDelete);
                }
            }
        }
    }

}
