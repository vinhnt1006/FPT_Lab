
package dao;

import dto.Examination;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;;

public class ExaminationList extends ArrayList<Examination> implements I_ExaminationList {
    
    public Examination createDp(String x) {
        StringTokenizer t = new StringTokenizer(x, ",");
        String examinationID = t.nextToken().trim();
        String doctorID = t.nextToken().trim();
        String patientID = t.nextToken().trim();
        String result = t.nextToken().trim();
        String date = t.nextToken().trim();
        return (new Examination(patientID, examinationID, doctorID, result, date));
    }

    @Override
    public void loadExaminationfromFile(String fname) throws Exception {
        String examination;
        try {
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream ff = new ObjectInputStream(f);
            while (f.available() > 0) {
                examination = (String) ff.readObject();
                this.add(createDp(examination));
            }
            f.close();
            ff.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void storeExamination(String fname) throws Exception {
        if(this.isEmpty()){
            System.out.println("Empty department!");
        }
        FileOutputStream f = new FileOutputStream(fname);
        ObjectOutputStream ff = new ObjectOutputStream(f);
        for (Examination dpt : this) {
            ff.writeObject(dpt.toString());
        }
        f.close();
        ff.close();
        System.out.println("Stored department success.");
    }
    
}
