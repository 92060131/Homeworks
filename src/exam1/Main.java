package exam1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        List<Student> list=new ArrayList<Student>();
        for (int i=0;i<2;i++){
            System.out.println("Введите сведения о студенте:");
            list.add(i,new Student(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(), scan.nextLine(), scaner.nextInt(),scaner.nextInt()));
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        System.out.printf("%3s %11s %14s %16s %18s %12s %13s %14s %14s %16s","id","LastName","FirstName","MidleName",
                "DayofBirth","Adress","PhoneNumber","FacultyName","CourseN","GroupN");
        System.out.println();
        Iterator<Student> iter=list.iterator();
        while(iter.hasNext())
        {
            System.out.println();
            iter.next().show();
        }
        List<Student> list1=new ArrayList<Student>(list);
        List<Student> list2=new ArrayList<Student>(list);
        List<Student> list3=new ArrayList<Student>(list);
        List<Student> list4=new ArrayList<Student>(list);
        System.out.println("Введите название факултета");
        String faculty= scan.nextLine();
        Student.getStudentsOfFaculty((ArrayList<Student>) list1,faculty );
        System.out.println("Введите курс");
        int course= scaner.nextInt();
        Student.getStudentsOfFacultyAndCourse((ArrayList<Student>) list2,faculty, course);
        System.out.println("Введите номер группы");
        int group= scaner.nextInt();
        Student.getStudentGroup((ArrayList<Student>) list3,group);
        System.out.println("Введите год рождения");
        String Year=scan.nextLine();
        Student.getStudentsByYear((ArrayList<Student>) list4,Year);

    }
}
