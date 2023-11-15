package ex4;

public class User {
	private String username; 
	private String password; 
	private String firstName; 
	private String middleName; 
	private String lastName;

	public User(String username, String password, String firstName, String middleName, String lastName) {
		this.username = username; 
		this.password = password; 
		this.firstName = firstName; 
		this.middleName = middleName; 
		this.lastName = lastName;
	}


	public String getUsername() { 
		return username;
	}

	public void setUsername(String username) { 
		this.username = username;
	}

	public String getPassword() { 
		return password;
	}
	
	public void setPassword(String password) { 
		this.password = password;
	}
	
	public String getFirstName() { 
		return firstName;
	}

	public void setFirstName(String firstName) { 
		this.firstName = firstName;
	}

	public String getMiddleName() { 
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toCSV() {
		return username + "," + password + "," + firstName + "," + middleName
		+ "," + lastName;
	}
	
	public String getRole() {
		if (this instanceof Admin) { 
			return "Admin";
		} else if (this instanceof Student) { 
			return "Student";
		} else if (this instanceof Staff) { 
			return "Staff";
		} else {
			return "Unknown";
		}
	}
}
