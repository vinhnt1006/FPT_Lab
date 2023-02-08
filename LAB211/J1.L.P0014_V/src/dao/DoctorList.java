package dao;

import dto.Doctor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DoctorList extends ArrayList<Doctor> implements I_DoctorList {

    public Doctor createDp(String x) {
        StringTokenizer t = new StringTokenizer(x, ",");
        String doctorID = t.nextToken().trim();
        String doctorName = t.nextToken().trim();
        String sex = t.nextToken().trim();
        String address = t.nextToken().trim();
        String departmentID = t.nextToken().trim();
        String departmentName = t.nextToken().trim();
        String createDate = t.nextToken().trim();
        String lastUpdateDate;
        if (!t.hasMoreTokens()) {
            lastUpdateDate = "";
        } else {
            lastUpdateDate = t.nextToken().trim();
        }
        return (new Doctor(doctorID, doctorName, sex, address, departmentID, departmentName, createDate, lastUpdateDate));
    }

    @Override
    public void loadDoctorfromFile(String fname) throws Exception {
        String doctor;
        try {
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream ff = new ObjectInputStream(f);
            while (f.available() > 0) {
                doctor = (String) ff.readObject();
                this.add(createDp(doctor));
            }
            f.close();
            ff.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void storeDoctor(String fname) throws Exception {
        if (this.isEmpty()) {
            System.out.println("Empty doctor!");
        }
        FileOutputStream f = new FileOutputStream(fname);
        ObjectOutputStream ff = new ObjectOutputStream(f);
        for (Doctor dpt : this) {
            ff.writeObject(dpt.toString());
        }
        f.close();
        ff.close();
        System.out.println("Stored doctor success.");
    }

}
