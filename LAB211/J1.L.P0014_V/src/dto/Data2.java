package dto;

public abstract class Data2 {
    private String patientID; 

    public Data2(String patientID) {
        this.patientID = patientID;
    }
    
    public Data2(){
        patientID = "";
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    
}
