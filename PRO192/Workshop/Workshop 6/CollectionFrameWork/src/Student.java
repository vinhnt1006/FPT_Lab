
public class Student {
	private String codeString ="";
	private String nameString= "";
	private int mark =0;
	public Student() {
		super();
	}
	public Student(String codeString, String nameString, int mark) {
		super();
		this.codeString = codeString.toUpperCase();
		this.nameString = nameString.toUpperCase();
		this.mark = (mark)>0 && mark <=10? mark:0;
	}
	public String getCodeString() {
		return codeString;
	}
	public void setCodeString(String codeString) {
		this.codeString = codeString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString.trim().toUpperCase();
		if(nameString.length()>0) this.nameString = nameString;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		if(mark >= 0 && mark <=10)
			this.mark = mark;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
