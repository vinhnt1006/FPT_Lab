
package dto;

public class Patient extends Data2{
    String patientName;
    int age;
    String address;

    public Patient(String patientID, String patientName, int age, String address) {
        super(patientID);
        this.patientName = patientName;
        this.age = age;
        this.address = address;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
