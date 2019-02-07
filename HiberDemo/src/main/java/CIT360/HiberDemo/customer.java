package CIT360.HiberDemo;

import javax.persistence.Entity;
import javax.persistence.Id;


// This @Entity is what is called an annotation. It tells Hibernate that this class is allowed to store its
// object inside the database.
//
// Table name is derived from the @Entity name if @Table isn't specified.

@Entity
public class customer {
	
	//****************************************************************************************************
	//OTHER ANNOTAIONS:  @Column to change a column name, 
	//                   @Transient will take a column out of the table. (actually creates table w/out it.
	//****************************************************************************************************
	
	//@Id is an annotation that specifics you are getting a primary key.
	@Id
	private int    customer_id;
	private String customer_Fname;
	private String customer_lname;
	
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_Fname() {
		return customer_Fname;
	}
	public void setCustomer_Fname(String customer_Fname) {
		this.customer_Fname = customer_Fname;
	}
	public String getCustomer_lname() {
		return customer_lname;
	}
	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}
	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", customer_Fname=" + customer_Fname + ", customer_lname="
				+ customer_lname + "]";
	}
	
	
	
}
