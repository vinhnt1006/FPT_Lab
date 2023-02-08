package dto;

public abstract class Data {
    private String departmentID;
    private String createDate;
    private String lastUpdateDate;
    private String name;
    
    public Data(String departmentID, String name, String createDate, String lastUpdateDate){
        this.departmentID = departmentID;
        this.name = name;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Data() {
        departmentID = "";
        name = "";
        createDate = "";
        lastUpdateDate = "";
    }

    public String getDepartmentID() {
        return departmentID;
    }

//    public void setDepartmentID(String departmentID) {
//        this.departmentID = departmentID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return departmentID + "," + name + "," + createDate + "," + lastUpdateDate;
    }
    
    
}
