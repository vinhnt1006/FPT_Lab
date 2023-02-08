package dao;

import dto.Department;
import dto.Doctor;
import dto.Examination;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import mylib.Valid;

public class Hospital implements I_Hospital {
    
    Scanner sc = new Scanner(System.in);
    
    DoctorList dtr;
    DepartmentList dpm;
    ExaminationList exl;
    
    private boolean confirmation(String c) {
        boolean t = true;
        if (c.equalsIgnoreCase("N")) {
            t = false;
        }
        return t;
    }
    
    public boolean findDoctor(String id) {
        for (Doctor thi : dtr) {
            if (thi.getDoctorID().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    public int findDoctorId(String id) {
        for (int i = 0; i < dtr.size(); i++) {
            if (id.equals(dtr.get(i).getDoctorID())) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean findPatient(String id) {
        for (Examination thi : exl) {
            if (thi.getPatientID().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    public int findPatientId(String id) {
        for (int i = 0; i < exl.size(); i++) {
            if (id.equals(exl.get(i).getPatientID())) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean findDepartment(String id) {
        for (Department thi : dpm) {
            if (thi.getDepartmentID().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    public int findDepartmentID(String id) {
        for (int i = 0; i < dpm.size(); i++) {
            if (id.equals(dpm.get(i).getDepartmentID())) {
                return i;
            }
        }
        return -1;
    }
    
    public Hospital(DoctorList dtr, DepartmentList dpm, ExaminationList exl) {
        this.dtr = dtr;
        this.dpm = dpm;
        this.exl = exl;
    }
    
    @Override
    public void showDoctor() {
        if (dtr.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            for (Doctor doctor : dtr) {
                System.out.println(doctor);
            }
        }
    }
    
    @Override
    public void showDepartment() {
        if (dpm.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            for (Department department : dpm) {
                System.out.println(department);
            }
        }
    }
    
    @Override
    public void addDoctor() {
        String doctorID;
        String doctorName;
        String sex;
        String address;
        String departmentID;
        String departmentName;
        String createDate;
        String lastUpdateDate;
        String confirm = null;
        boolean confirmed = true;
        boolean ok = true;
        boolean duplicate;
        
        while (confirmed) {
            System.out.print("Input doctor ID: ");
            do {
                doctorID = sc.nextLine().toUpperCase();
                duplicate = findDoctor(doctorID);
                if (duplicate) {
                    System.out.println("Doctor ID is duplicated! Enter doctor ID again: ");
                }
            } while (duplicate);
            
            System.out.println("Input doctor name: ");
            doctorName = Valid.checkInputNull();
            
            System.out.println("Input doctor sex: ");
            sex = Valid.checkInputNull();
            
            System.out.println("Input doctor address: ");
            address = Valid.checkInputNull();
            
            System.out.println("Input department ID: ");
            boolean check = true;
            do {
                departmentID = sc.nextLine().toUpperCase();
                boolean checkID = findDepartment(departmentID);
                if (!checkID) {
                    System.out.println("Not exits department ID! Enter department ID again:");
                    check = true;
                } else {
                    check = false;
                }
            } while (check);
            
            System.out.println("Input department name: ");
            departmentName = Valid.checkInputNull();
            
            Date date = new Date();
            System.out.println("Input Create date:");
            SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
            createDate = formatter.format(date);
            
            lastUpdateDate = "";
            
            Doctor dtor = new Doctor(doctorID, doctorName, sex, address, departmentID, departmentName, createDate, lastUpdateDate);
            dtr.add(dtor);
            
            System.out.println("Do you want to continue? [Y/N]");
            while (ok) {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("Y")) || (confirm.equalsIgnoreCase("N"))) {
                    ok = false;
                } else {
                    System.out.println("Wrong input format! Enter again: [Y/N]");
                }
            }
            confirmed = confirmation(confirm);
        }
    }
    
    @Override
    public void addDepartment() {
        String departmentID;
        String departmentName;
        String createDate;
        String lastUpdateDate;
        String confirm = null;
        boolean confirmed = true;
        boolean ok = true;
        boolean duplicate;
        
        while (confirmed) {
            System.out.print("Input department ID: ");
            do {
                departmentID = sc.nextLine().toUpperCase();
                duplicate = findDepartment(departmentID);
                if (duplicate) {
                    System.out.println("Department ID is duplicated! Enter department ID again: ");
                }
            } while (duplicate);
            
            System.out.println("Input department name: ");
            departmentName = Valid.checkInputNull();
            
            Date date = new Date();
            System.out.println("Input Create date:");
            SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
            createDate = formatter.format(date);
            
            lastUpdateDate = "";
            
            Department department = new Department(departmentID, departmentName, createDate, lastUpdateDate);
            dpm.add(department);
            
            System.out.println("Do you want to continue? [Y/N]");
            while (ok) {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("Y")) || (confirm.equalsIgnoreCase("N"))) {
                    ok = false;
                } else {
                    System.out.println("Wrong input format! Enter again: [Y/N]");
                }
            }
            confirmed = confirmation(confirm);
        }
    }
    
    @Override
    public void updateDoctor() {
        String doctorID;
        String doctorName;
        String departmentName;
        String sex;
        String address;
        String lastUpdateDate;
        boolean confirmed = true;
        boolean duplicated;
        Department dp;
        
        while (confirmed) {
            System.out.print("Input doctor ID: ");
            do {
                doctorID = sc.nextLine().toUpperCase();
                duplicated = findDoctor(doctorID);
                if (!duplicated) {
                    System.out.print("Doctor is not exist! Enter doctor ID again: ");
                }
            } while (!duplicated);
            
            int pos = findDoctorId(doctorID);
            if (pos < 0) {
                System.out.print("This doctor does not exist!");
            } else {
                doctorName = dtr.get(pos).getName();
                System.out.print("Old name: " + doctorName + ", new name: ");
                String newName = sc.nextLine();
                if (!newName.equals("")) {
                    dtr.get(pos).setDoctorName(doctorName);
                }
                
                sex = dtr.get(pos).getSex();
                System.out.print("Old sex: " + sex + ", new sex: ");
                String newSex = sc.nextLine();
                if (!newSex.equals("")) {
                    dtr.get(pos).setSex(newSex);
                }
                
                address = dtr.get(pos).getAddress();
                System.out.print("Old address: " + address + ", new address: ");
                String newAddress = sc.nextLine();
                if (!newAddress.equals("")) {
                    dtr.get(pos).setAddress(newAddress);
                }
                
                if (findDepartmentID(dpm.get(pos).getDepartmentID()) > 0) {
                    System.out.println("Department ID: " + dtr.get(pos).getDepartmentID());
                } else {
                    System.out.println("No Department in List!");
                }
                departmentName = dtr.get(pos).getName();
                System.out.print("Old name: " + departmentName + ", new name: ");
                String newDName = sc.nextLine();
                if (!newDName.equals("")) {
                    dtr.get(pos).setName(newDName);
                }
                System.out.println("Create date: " + dtr.get(pos).getCreateDate());
                
                Date date = new Date();
                System.out.println("Input last update date: ");
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                lastUpdateDate = formatter.format(date);
                if (!lastUpdateDate.equals("")) {
                    dtr.get(pos).setLastUpdateDate(lastUpdateDate);
                }
            }
            confirmed = false;
        }
    }
    
    @Override
    public void updateDepartment() {
        String departmentID;
        String departmentName;
        String lastUpdateDate;
        boolean confirmed = true;
        boolean duplicated;
        
        while (confirmed) {
            System.out.print("Input department ID: ");
            do {
                departmentID = sc.nextLine().toUpperCase();
                duplicated = findDepartment(departmentID);
                if (!duplicated) {
                    System.out.print("Department is not exist! Enter department ID again: ");
                }
            } while (!duplicated);
            
            int pos = this.findDepartmentID(departmentID);
            if (pos < 0) {
                System.out.print("This department does not exist!");
            } else {
                System.out.println("Department ID: " + dpm.get(pos).getDepartmentID());
                departmentName = dtr.get(pos).getName();
                System.out.print("Old name: " + departmentName + ", new name: ");
                String newDName = sc.nextLine();
                if (!newDName.equals("")) {
                    dtr.get(pos).setName(newDName);
                }
                System.out.println("Create date: " + dpm.get(pos).getCreateDate());
                
                Date date = new Date();
                System.out.println("Input last update date: ");
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                lastUpdateDate = formatter.format(date);
                if (!lastUpdateDate.equals("")) {
                    dpm.get(pos).setLastUpdateDate(lastUpdateDate);
                }
            }
            confirmed = false;
        }
    }
    
    @Override
    public void deleteDoctor() {
        System.out.print("Continue? [Y/N]: ");
        boolean matched = true;
        String check;
        boolean ok = false;
        do {
            check = Valid.checkInputNull();
            if ((check.equalsIgnoreCase("N"))) {
                ok = false;
                matched = false;
            } else if ((check.equalsIgnoreCase("Y"))) {
                ok = true;
                matched = false;
            } else {
                System.out.print("Wrong format! Enter again! [Y/N]: ");
            }
        } while (matched);
        
        if (ok) {
            String doctorID = sc.nextLine().toUpperCase();
            int pos = findDoctorId(doctorID);
            if (pos < 0) {
                System.out.print("This doctor does not exist!");
            } else {
                dtr.remove(doctorID);
                System.out.println("Successed!");
            }
        }
    }
    
    @Override
    public void deleteDepartment() {
        System.out.print("Continue? [Y/N]: ");
        boolean matched = true;
        String check;
        boolean ok = false;
        do {
            check = Valid.checkInputNull();
            if ((check.equalsIgnoreCase("N"))) {
                ok = false;
                matched = false;
            } else if ((check.equalsIgnoreCase("Y"))) {
                ok = true;
                matched = false;
            } else {
                System.out.print("Wrong format! Enter again! [Y/N]: ");
            }
        } while (matched);
        
        if (ok) {
            String departmantID = sc.nextLine().toUpperCase();
            int pos = findDepartmentID(departmantID);
            int pos2 = -1;
            for (Doctor doctor : dtr) {
                if (doctor.getDepartmentID().equals(departmantID)) {
                    pos2 = findDoctorId(doctor.getDoctorID());
                }
            }
            if (pos < 0) {
                System.out.print("This doctor does not exist!");
            } else {
                if (pos2 > 0) {
                    dpm.remove(departmantID);
                    System.out.println("Successed!");
                } else {
                    System.out.println("Fail!");
                }
            }
        }
    }
    
    @Override
    public void searchDoctor() {
        String nameDoctor = null;
        boolean ok = false;
        nameDoctor = Valid.checkInputNull();
        for (Doctor thi : dtr) {
            if (thi.getName().equalsIgnoreCase(nameDoctor)) {
                System.out.println(thi);
                ok = true;
            }
        }
        if (!ok) {
            System.out.println("No doctor have name: " + nameDoctor);
        }
    }
    
    @Override
    public void searchDepartment() {
        String nameDepartment = null;
        boolean ok = false;
        nameDepartment = Valid.checkInputNull();
        for (Department thi : dpm) {
            if (thi.getName().equalsIgnoreCase(nameDepartment)) {
                System.out.println(thi);
                ok = true;
            }
        }
        if (!ok) {
            System.out.println("No department have name: " + nameDepartment);
        }
    }
    
    @Override
    public void showExamination() {
        if (exl.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            for (Examination ex : exl) {
                System.out.println(ex);
            }
        }
    }
    
    @Override
    public void addExamination() {
        String doctorID;
        String patientID;
        String result;
        String date;
        String confirm = null;
        boolean confirmed = true;
        boolean ok = true;
        boolean duplicated;
        
        while (confirmed) {
            System.out.print("Input doctor ID: ");
            do {
                doctorID = sc.nextLine().toUpperCase();
                duplicated = findDoctor(doctorID);
                if (!duplicated) {
                    System.out.print("Doctor is not exist! Enter doctor ID again: ");
                }
            } while (!duplicated);
            
            System.out.print("Input doctor ID: ");
            do {
                patientID = sc.nextLine().toUpperCase();
                duplicated = findPatient(patientID);
                if (!duplicated) {
                    System.out.print("Doctor is not exist! Enter doctor ID again: ");
                }
            } while (!duplicated);
            
            result = "";
            date = "";
            
            Examination ex = new Examination(patientID, patientID, doctorID, result, date);
            exl.add(ex);
            
            System.out.println("Do you want to continue? [Y/N]");
            while (ok) {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("Y")) || (confirm.equalsIgnoreCase("N"))) {
                    ok = false;
                } else {
                    System.out.println("Wrong input format! Enter again: [Y/N]");
                }
            }
            confirmed = confirmation(confirm);
        }
    }
    
    @Override
    public void recordMedicalExamination() {
        System.out.print("Continue? [Y/N]: ");
        boolean matched = true;
        String check;
        boolean ok = false;
        do {
            check = Valid.checkInputNull();
            if ((check.equalsIgnoreCase("N"))) {
                ok = false;
                matched = false;
            } else if ((check.equalsIgnoreCase("Y"))) {
                ok = true;
                matched = false;
            } else {
                System.out.print("Wrong format! Enter again! [Y/N]: ");
            }
        } while (matched);
        
        if (ok) {
            String doctorID = sc.nextLine().toUpperCase();
            String patientID = sc.nextLine().toUpperCase();
            int pos = findDoctorId(doctorID);
            int pos2 = findPatientId(patientID);
            if (pos < 0 && pos2 < 0) {
                System.out.print("This examination does not exist!");
            } else if (pos >= 0 && pos2 >= 0 && pos == pos2) {
                String result;
                result = sc.nextLine().toUpperCase();
                if (!result.equals("")) {
                    exl.get(pos2).setResult(result);
                }
                
                String dateP;
                Date date = new Date();
                System.out.println("Input Create date:");
                SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
                dateP = formatter.format(date);
                exl.get(pos2).setDate(dateP);
            }
        }
    }
    
}
