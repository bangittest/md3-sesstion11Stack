package Student.impl;

import java.util.Stack;

import static java.lang.CharSequence.compare;

public class SortStudent {
    public static void sortStudent(Stack<Student> students) {
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1,Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        //Xep sap theo ten a b c
        students.sort(((o1, o2) ->compare(o1.getName(),o2.getName()) ));
        for (Student student : students) {
            System.out.println("ds sau khi sap xep la");
            student.displayData();
        }

    }
}
