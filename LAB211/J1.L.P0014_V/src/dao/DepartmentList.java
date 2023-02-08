package dao;

import dto.Department;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DepartmentList extends ArrayList<Department> implements I_DepartmentList {

    public Department createDp(String x) {
        StringTokenizer t = new StringTokenizer(x, ",");
        String id = t.nextToken().trim();
        String name = t.nextToken().trim();
        String createDate = t.nextToken().trim();
        String lastUpdateDate;
        if (!t.hasMoreTokens()) {
            lastUpdateDate = "";
        } else {
            lastUpdateDate = t.nextToken().trim();
        }
        return (new Department(id, name, createDate, lastUpdateDate));
    }

    @Override
    public void loadDepartmentfromFile(String fname) throws Exception {
        String department;
        try {
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream ff = new ObjectInputStream(f);
            while (f.available() > 0) {
                department = (String) ff.readObject();
                this.add(createDp(department));
            }
            f.close();
            ff.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void storeDepartment(String fname) throws Exception {
        if(this.isEmpty()){
            System.out.println("Empty department!");
        }
        FileOutputStream f = new FileOutputStream(fname);
        ObjectOutputStream ff = new ObjectOutputStream(f);
        for (Department dpt : this) {
            ff.writeObject(dpt.toString());
        }
        f.close();
        ff.close();
        System.out.println("Stored department success.");
    }
}
