package main;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String contactPhone;
	private String contactAddress;
	
	//Constructor
	public Contact(String contactId, String firstName, String lastName, String contactPhone, String contactAddress) {
		//Contact ID requirements check
        if(contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("ID is invalid - null or length > 10");
        }
        //First Name requirements check
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name is invalid - null or length > 10");
        }
        //Last Name requirements check
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name is invalid - null or length > 10");
        }
        //Phone requirements check
        if(contactPhone == null || contactPhone.length() > 10) {
            throw new IllegalArgumentException("Phone number is invalid - null or length > 10");
        }
        //Address requirements check
        if(contactAddress == null || contactAddress.length() > 30) {
            throw new IllegalArgumentException("Address is invalid - null or length > 10");
        }

        //No errors, set values
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhone = contactPhone;
        this.contactAddress = contactAddress;
	}
	
	//Accessor methods
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }
    
    //Setter methods
    public void setContactId(String contactId) {
    	if(contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("ID is invalid - null or length > 10");
        }
        this.contactId = contactId;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name is invalid - null or length > 10");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name is invalid - null or length > 10");
        }
        this.lastName = lastName;
    }

    public void setContactPhone(String contactPhone) {
    	if(contactPhone == null || contactPhone.length() > 10) {
            throw new IllegalArgumentException("Phone number is invalid - null or length > 10");
        }
        this.contactPhone = contactPhone;
    }

    public void setContactAddress(String contactAddress) {
    	if(contactAddress == null || contactAddress.length() > 30) {
            throw new IllegalArgumentException("Address is invalid - null or length > 10");
        }
        this.contactAddress = contactAddress;
    }
    
}
