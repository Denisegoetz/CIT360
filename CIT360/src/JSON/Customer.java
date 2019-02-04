package JSON;

public class Customer{
	
	public int id;
    public String  firstname;
    public String  lastname;
    public Address addressObject; 
    public String  phonenumber;
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	public Address getAddressObject() {
		return addressObject;
	}
	public void setAddressObject(Address addressObject) {
		this.addressObject = addressObject;
	}
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
      
	
}