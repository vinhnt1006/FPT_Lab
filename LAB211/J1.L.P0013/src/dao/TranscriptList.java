package dao;

import dto.Student;
import dto.Subject;
import dto.ClassTranscript;
import java.util.ArrayList;
import java.util.Scanner;
import mylib.Valid;

public class TranscriptList extends ArrayList<ClassTranscript> {

    Scanner sc = new Scanner(System.in);
    StudentList StuList;
    SubjectList SubList;

    public TranscriptList(StudentList stuList, SubjectList subList) {
        this.StuList = stuList;
        this.SubList = subList;
    }

    public boolean findStudent(String id) {
        return StuList.containsKey(id) ? true : false;
    }

    public boolean findSubject(String id) {
        return SubList.containsKey(id) ? true : false;
    }

    public int search(String stuID, String subID) {
        for (ClassTranscript trans : this) {
            if (trans.stu.getId().equalsIgnoreCase(stuID) && trans.sub.getId().equalsIgnoreCase(stuID)) {
                return indexOf(trans);
            }
        }
        return -1;
    }

    public void Grade() {
        String confirm;
        String stuId = null;
        String subId = null;
        double labMark = 0.0;
        double testMark = 0.0;
        double finalMark = 0.0;
        Student std;
        Subject sub;
        boolean matched;
        boolean confirmed = false;
        int grade;
        do {
            boolean ok = true;
            if (ok) {
                System.out.print("Enter the student id [Format SExxxxxx]: ");
                do {
                    stuId = sc.nextLine().toUpperCase();
                    matched = stuId.matches("^SE\\d{6}$");
                    if (!matched) {
                        System.out.println("Wrong format!");
                    }
                } while ((!matched));
                if (!findStudent(stuId)) {
                    System.out.println("Student does not exist!");
                    ok = false;
                }
            }
            if (ok) {
                System.out.print("Enter subject id: ");
                subId = sc.nextLine().toUpperCase();
                if (!findSubject(subId)) {
                    System.out.println("Subject does not exist!");
                    ok = false;
                }
            }
            if (ok) {
                std = StuList.get(stuId);
                sub = SubList.get(subId);
                grade = search(stuId, subId);
                if (grade != -1) {
                    System.out.print("The grade existed! Do you want to update score of this subject for this student? [Y/N]: ");
                    matched = true;
                    do {
                        confirm = Valid.checkInputNull();
                        if ((confirm.equalsIgnoreCase("N"))) {
                            confirmed = false;
                            matched = false;
                        } else if ((confirm.equalsIgnoreCase("Y"))) {
                            confirmed = true;
                            matched = false;
                        } else {
                            System.out.print("Wrong format! Enter again! [Y/N]: ");
                        }
                    } while (matched);
                }
                if ((confirmed) || (grade == -1)) {
                    System.out.print("Enter lab score: ");
                    labMark = Valid.checkInputScore();
                    System.out.print("Enter progress test score: ");
                    testMark = Valid.checkInputScore();
                    System.out.print("Enter final exam score: ");
                    finalMark = Valid.checkInputScore();
                    this.add(new ClassTranscript(std, sub, labMark, testMark, finalMark));
                }
            }
            System.out.print("Continue? [Y/N]: ");
            matched = true;
            do {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("N"))) {
                    confirmed = false;
                    matched = false;
                } else if ((confirm.equalsIgnoreCase("Y"))) {
                    confirmed = true;
                    matched = false;
                } else {
                    System.out.print("Wrong format! Enter again! [Y/N]: ");
                }
            } while (matched);
        } while (confirmed);
    }

    public void printStudentGradeReport() {
        String confirm;
        String stuId = null;
        Student std;
        boolean matched = false;
        boolean confirmed = false;
        do {
            boolean ok = true;
            if (ok) {
                System.out.print("Enter the student id [Format SExxxxxx]: ");
                do {
                    stuId = sc.nextLine().toUpperCase();
                    matched = stuId.matches("^SE\\d{6}$");
                    if (!matched) {
                        System.out.println("Wrong format!");
                    }
                } while ((!matched));
                if (!findStudent(stuId)) {
                    System.out.println("Student does not exist!");
                    ok = false;
                }
            }
            if (ok) {
                if (this.size() == 0) {
                    System.out.println("No grade to display!");
                } else {
                    std = StuList.get(stuId);
                    System.out.println("- Student ID: " + std.getId());
                    System.out.println("- Student name: " + std.getFirstName() + " " + std.getLastName());
                    System.out.println("List of subject sort by Subject Name:");
                    int count = 1;
                    for (ClassTranscript thi : this) {
                        if (stuId.equalsIgnoreCase(thi.getStu().getId())) {
                            if (thi.aveMark() >= 4) {
                                System.out.println("\nNo: " + count);
                                System.out.println("Subject name: " + thi.getSub().getName());
                                System.out.println("Average mark: " + thi.aveMark());
                                System.out.println("Status: Pass\n\n");
                                count++;
                            } else if (thi.aveMark() < 4) {
                                System.out.println("\nNo: " + count);
                                System.out.println("Subject name: " + thi.getSub().getName());
                                System.out.println("Average mark: " + thi.aveMark());
                                System.out.println("Status: Not Pass\n\n");
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.print("Continue? [Y/N]: ");
            do {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("N"))) {
                    confirmed = false;
                    matched = false;
                } else if ((confirm.equalsIgnoreCase("Y"))) {
                    confirmed = true;
                    matched = false;
                } else {
                    System.out.print("Wrong input format! Enter again! [Y/N]: ");
                }
            } while (matched);
        } while (confirmed);
    }

    public void printSubjectGradeReport() {
        String confirm;
        String subId = null;
        Subject sub;
        boolean matched = false, confirmed = false;
        do {
            boolean ok = true;
            if (ok) {
                System.out.print("Enter the subject id: ");
                subId = sc.nextLine().toUpperCase();
                boolean check = findSubject(subId);
                if (!check) {
                    System.out.println("Subject does not exist!");
                    ok = false;
                }
            }
            if (ok) {
                if (this.size() == 0) {
                    System.out.println("No grade to display!");
                } else {
                    sub = SubList.get(subId);
                    System.out.println("- Subject ID: " + sub.getId());
                    System.out.println("- Subject name: " + sub.getName());
                    System.out.println("List of student sort by Student Name:");
                    for (ClassTranscript thi : this) {
                        if (subId.equalsIgnoreCase(thi.getSub().getId())) {
                            if (thi.aveMark() >= 4) {
                                System.out.println("\nStudent ID: " + thi.getStu().getId());
                                System.out.println("Student Name: " + thi.getStu().getFirstName() + " " + thi.getStu().getLastName());
                                System.out.println("Average mark: " + thi.aveMark());
                                System.out.println("Status: Pass\n\n");
                            } else if (thi.aveMark() < 4) {
                                System.out.println("\nStudent ID: " + thi.getStu().getId());
                                System.out.println("Student Name: " + thi.getStu().getFirstName() + " " + thi.getStu().getLastName());
                                System.out.println("Average mark: " + thi.aveMark());
                                System.out.println("Status: Not Pass\n\n");
                            }
                        }
                    }
                }
            }
            System.out.print("Continue? [Y/N]: ");
            do {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("N"))) {
                    confirmed = false;
                    matched = false;
                } else if ((confirm.equalsIgnoreCase("Y"))) {
                    confirmed = true;
                    matched = false;
                } else {
                    System.out.print("Wrong format! Enter again! [Y/N]: ");
                }
            } while (matched);
        } while (confirmed);
    }
}
