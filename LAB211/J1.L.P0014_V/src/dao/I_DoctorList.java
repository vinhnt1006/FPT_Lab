
package dao;

public interface I_DoctorList {
    
    void loadDoctorfromFile(String fname) throws Exception;
    
    void storeDoctor(String fname) throws Exception;
}
