package studentmanagment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity  
@Table()
public class Student {
	  @Id
	  @GeneratedValue(
			    strategy = GenerationType.SEQUENCE,
			    generator = "seq_student"
			)
			@SequenceGenerator(
			    name = "seq_student",
			    allocationSize = 1
			)
private int id;
	  @Column(name = "name")
private String name;
	  @Column(name = "email")
private String email;
	  @Column(name = "branch")
private String branch;
public Student(String name, String email, String branch) {
		super();
		this.name = name;
		this.email = email;
		this.branch = branch;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Student(int id, String name, String email, String branch) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.branch = branch;
}
public Student() {
	super();
}
public Student(int id) {
	super();
	this.id = id;
}

}
