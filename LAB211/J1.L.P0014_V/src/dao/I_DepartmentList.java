
package dao;

public interface I_DepartmentList {
    
    void loadDepartmentfromFile(String fname) throws Exception;
    
    void storeDepartment(String fname) throws Exception;
}
