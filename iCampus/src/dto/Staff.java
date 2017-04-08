package dto;

public class Staff 
{

	public int emp_id;
	
	public String name;
	
	public String role;
	
	public String contact;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int empId) {
		emp_id = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
