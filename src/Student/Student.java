package Student;

import config.Config;

public class Student implements Comparable<Student>{
    private static int nextId=1;
    private int id;
    private String name;
    private int age;
    private boolean status;
    public Student(){
        this.id=nextId++;
    }

    public Student(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(){

        System.out.println("nhap ten sinh vien");
        this.name= Config.scanner().nextLine();

        System.out.println("nhap tuoi sinh vien:");
        this.age=Config.scanner().nextInt();

        System.out.println("nhap trang thai true/false: ");
        this.status=Config.scanner().nextBoolean();

    }

    public void displayData(){
        System.out.println("ma hoc sinh: "+id);
        System.out.println("ten hoc sinh :" +name);
        System.out.println("tuoi hoc sinh : " +age);
        System.out.println("trang thai " +status);

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
