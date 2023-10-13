package Student.impl;

import config.Config;

import java.util.Stack;

public class SeachStudent {
    public static void seachStudent(Stack<Student> students) {
        //seach tim kiem theo ten
        if (students.isEmpty()){
            System.out.println("danh sach trong");
        }else {
            System.out.println("nhap ten sinh vien can tim :");
            String name= Config.scanner().nextLine();
            boolean found=false;
            for (Student student : students){
                if (student.getName().equalsIgnoreCase(name)){
                    System.out.println("tim thay sinh vien");
                    student.displayData();
                    found=true;
                }
            }
            if (!found){
                System.out.println("k tim thay sinh vien co ten " +name);
            }
        }
    }
}
