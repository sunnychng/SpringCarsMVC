package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	private String name;
	private String phone;
	private String year;
		
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, String phone, String year) {
		super();
		this.name = name;
		this.phone = phone;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getYear() {
		return year;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Owner [Name=" + name + ", Phone=" + phone + ", Year=" + year + "]";
	}
	
	
}
