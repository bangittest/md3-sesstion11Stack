package Student;
import Student.impl.*;
import config.Config;
import java.util.Stack;
public class Main {
    static Stack<Student>students=new Stack<Student>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1 them");
            System.out.println("2 hien thi danh sach");
            System.out.println("3 sua");
            System.out.println("4 xoa");
            System.out.println("5 sap xep");
            System.out.println("6 tim kiem theo ten");
            choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    AddStudent.addStudent(students);
                    break;
                case 2:
                    HienThi.hienThi(students);
                    break;
                case 3:
                    UpdateStudent.updateStudent(students);
                    break;
                case 4:
                    DeleteStudent.deleteStudent(students);
                    break;
                case 5:
                    SortStudent.sortStudent(students);
                    break;
                case 6:
                    SeachStudent.seachStudent(students);
                    break;
                default:
                    System.out.println("nhap k dung");
            }
        } while (choice!=7);
    }
}



