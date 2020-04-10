package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String make;
	private String model;
	private String type;
	private String status;
	@Autowired
	private Owner owner;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
		//this.status = "new";
	}

	public Vehicle(String make) {
		super();
		this.make = make;
	}

	public Vehicle(String make, String model, String type, String status) {
		super();
		this.make = make;
		this.model = model;
		this.type = type;
		this.status = status;
	}

	public Vehicle(long id, String make, String model, String type, String status) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.type = type;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}
	public String getStatus() {
		return status;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", type=" + type + ", statuss=" + status + ", Owner=" + owner + "]";
	}
	
	
	
}
