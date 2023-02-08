
package dao;

public interface I_ExaminationList {
    void loadExaminationfromFile(String fname) throws Exception;
    
    void storeExamination(String fname) throws Exception;
}
