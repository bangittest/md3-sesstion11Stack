package Student.impl;

import Student.impl.IStudent;
import config.Config;

public class Student implements IStudent {
    private static int nextId=1;
    private int id;
    private String name;
    private int age;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(){
        this.id=nextId++;
    }

    public Student(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void inputData(){
        System.out.println("Nhập tên sinh viên");
        this.name= Config.scanner().nextLine();
        System.out.println("Nhập tuổi sinh viên:");
        this.age=Config.scanner().nextInt();
        System.out.println("Nhập trạng thái true/false: ");
        this.status=Config.scanner().nextBoolean();
    }
    public void displayData(){
        System.out.println("Mã sinh viên: "+id);
        System.out.println("Tên sinh viên:" +name);
        System.out.println("Tuổi sinh viên : " +age);
        System.out.println("Trạng thái " +status);
    }
}
