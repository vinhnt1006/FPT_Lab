package dto;

public class Doctor extends Data {

    String doctorID;
    String doctorName;
    String sex;
    String address;

    public Doctor(String doctorID, String doctorName, String sex, String address, String departmentID, String departmentName, String createDate, String lastUpdateDate) {
        super(departmentID, departmentName, createDate, lastUpdateDate);
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.sex = sex;
        this.address = address;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return doctorID + "," + doctorName + "," + sex + "," + address + "," + super.toString(); //To change body of generated methods, choose Tools , Templates.
    }

}
