package testclass;

public class Author3 {
	private String name;
	private String email;

	// constructor
	public Author3(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	// getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Author[name = %s , email = %s ", name, email);

	}

}
