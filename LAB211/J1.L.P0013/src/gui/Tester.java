package gui;

import dao.StudentList;
import dao.SubjectList;
import dao.TranscriptList;
import mylib.Valid;

public class Tester {
    public static void main(String[] args) {
        StudentList stu = new StudentList();
        SubjectList sub = new SubjectList();
        TranscriptList gra = new TranscriptList(stu, sub);
        int choice=0;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Add new Student.");
            System.out.println("2. Update Student.");
            System.out.printf("%22s\n", "2.1. Update Student");
            System.out.printf("%22s\n", "2.2. Delete Student");
            System.out.println("3. Add new Subject.");
            System.out.println("4. Update Subject.");
            System.out.printf("%22s\n", "4.1. Update Subject");
            System.out.printf("%22s\n", "4.2. Delete Subject");
            System.out.println("5. Enter Grade.");            
            System.out.println("6. Student Grade Report.");
            System.out.println("7. Subject Grade Report.");
            System.out.println("Quit.");
            System.out.print("Enter a choice: ");
            choice=Valid.checkInputNum();   
            switch(choice){
                case 1:
                    stu.addStudent();
                    break;
                case 2:
                    stu.updateStudent();
                    break;
                case 3:
                    sub.addSubject();
                    break;
                case 4:
                    sub.updateSubject();
                    break;
                case 5:
                    gra.Grade();
                    break;
                case 6:
                    gra.printStudentGradeReport();
                    break;
                case 7: 
                    gra.printSubjectGradeReport();
                    break;
                default: System.out.println("");
            }
        }while (choice<=7 && choice >=1);
    }
}
