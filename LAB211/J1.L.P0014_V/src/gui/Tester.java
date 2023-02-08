package gui;

import dao.DepartmentList;
import dao.DoctorList;
import dao.ExaminationList;
import dao.Hospital;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import mylib.Valid;

public class Tester {

    public static void main(String[] args) throws Exception {
        String filename1 = "doctor.dat";
        String filename2 = "department.dat";
        String filename3 = "examination.dat";
        DoctorList dtor = new DoctorList();
        dtor.loadDoctorfromFile(filename1);
        DepartmentList dpm = new DepartmentList();
        dpm.loadDepartmentfromFile(filename2);
        ExaminationList exl = new ExaminationList();
        exl.loadExaminationfromFile(filename3);
        Hospital hpt = new Hospital(dtor, dpm, exl);
        int choice = 0;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Show data.");
            System.out.println("2. Add.");
            System.out.println("3. Update.");
            System.out.println("4. Delete.");
            System.out.println("5. Search.");
            System.out.println("6. Back up & Real-time update processing.");
            System.out.println("Quit.");
            System.out.print("Enter a choice: ");
            choice = Valid.checkInputNum();
            switch (choice) {
                case 1:
                    int choices = 0;
                    System.out.printf("%-30s\n", "1.1. Show all data in the doctor.dat file into the screen.");
                    System.out.printf("%-30s\n", "1.2. Show all data in the depertment.dat file into the screen.");
                    System.out.printf("%-30s\n", "1.3. Show all data in the examination.dat file into the screen.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Show all data in the doctor.dat file into the screen");
                        hpt.showDoctor();
                    } else if (choices == 2) {
                        System.out.println("Show all data in the depertment.dat file into the screen");
                        hpt.showDepartment();
                    } else if (choices == 3) {
                        System.out.println("Show all data in the examination.dat file into the screen");
                        hpt.showExamination();
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                case 2:
                    choices = 0;
                    System.out.printf("%-30s\n", "2.1. Add new doctor.");
                    System.out.printf("%-30s\n", "2.2. Add new department.");
                    System.out.printf("%-30s\n", "2.3. Add new examination.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Add doctor.");
                        hpt.addDoctor();
                    } else if (choices == 2) {
                        System.out.println("Add Department.");
                        hpt.addDepartment();
                    } else if (choices == 3) {
                        System.out.println("Add Patient.");
                        hpt.addExamination();
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                case 3:
                    choices = 0;
                    System.out.printf("%-30s\n", "3.1. Update a doctor.");
                    System.out.printf("%-30s\n", "3.2. Update new department.");
                    System.out.printf("%-30s\n", "3.3. Record medical examination.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Update doctor.");
                        hpt.updateDoctor();
                    } else if (choices == 2) {
                        System.out.println("Update Department.");
                        hpt.updateDepartment();
                    } else if (choices == 3) {
                        System.out.println("Record medical examination.");
                        hpt.recordMedicalExamination();
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                case 4:
                    choices = 0;
                    System.out.printf("%-30s\n", "4.1. Delete a doctor.");
                    System.out.printf("%-30s\n", "4.2. Delete a department.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Delete doctor.");
                        hpt.deleteDoctor();
                    } else if (choices == 2) {
                        System.out.println("Delete Department.");
                        hpt.deleteDepartment();
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                case 5:
                    choices = 0;
                    System.out.printf("%-30s\n", "5.1. Search a doctor.");
                    System.out.printf("%-30s\n", "5.2. Search a department.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Search doctor.");
                        hpt.searchDoctor();
                    } else if (choices == 2) {
                        System.out.println("Search Department.");
                        hpt.searchDepartment();
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                case 6:
                    choices = 0;
                    System.out.printf("%-30s\n", "6.1. Store doctor.");
                    System.out.printf("%-30s\n", "6.2. Store department.");
                    System.out.printf("%-30s\n", "6.2. Store examination.");
                    System.out.print("Input choices: ");
                    choices = Valid.checkInputNum();
                    if (choices == 1) {
                        System.out.println("Store doctor.");
                        dtor.storeDoctor(filename1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        System.out.println(dtf.format(now));
                    } else if (choices == 2) {
                        System.out.println("Store Department.");
                        dpm.storeDepartment(filename2);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        System.out.println(dtf.format(now));
                    } else if (choices == 3) {
                        System.out.println("Store examination.");
                        exl.storeExamination(filename3);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        System.out.println(dtf.format(now));
                    } else {
                        System.out.println("Wrong format!");
                    }
                    break;
                default:
                    System.out.println("Exit!");
            }
        } while (choice <= 6 && choice >= 1);
    }
}
