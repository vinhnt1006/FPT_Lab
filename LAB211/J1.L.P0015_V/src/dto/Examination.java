
package dto;

public class Examination extends Data2{
    String examinationID;
    String doctorID;
    String result;
    String date;

    public Examination(String patientID, String examinationID, String doctorID, String result, String date) {
        super(patientID);
        this.examinationID = examinationID;
        this.doctorID = doctorID;
        this.result = result;
        this.date = date;
    }

    public String getExaminationID() {
        return examinationID;
    }

    public void setExaminationID(String examinationID) {
        this.examinationID = examinationID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
