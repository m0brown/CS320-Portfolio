package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;
import main.Contact;


class ContactTest {
	// Test the Contact constructor
    @Test
    void testContactClass(){
        Contact contact = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        assertTrue(contact.getContactId().equals("LK12345"));
        assertTrue(contact.getFirstName().equals("Leslie"));
        assertTrue(contact.getLastName().equals("Knope"));
        assertTrue(contact.getContactPhone().equals("123-4567"));
        assertTrue(contact.getContactAddress().equals("123 Main St."));
    }
    
    // Test data for too long ID
    @Test
    void testContactIdTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345678900", "Leslie", "Knope", "123-4567","123 Main St.");
        });
    }

    // Test data for null ID
    @Test
    void testContactIdNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Leslie", "Knope", "123-4567","123 Main St.");
        });
    }

    // Test data for too long first name
    @Test
    void testContactFirstNameTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie123456789", "Knope", "123-4567","123 Main St.");
        });
    }

    // Test data for null first name
    @Test
    void testContactFirstNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", null, "Knope", "123-4567","123 Main St.");
        });
    }

    // Test data for too long last name
    @Test
    void testContactLastNameTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", "Knope123456789", "123456","123 Main St.");
        });
    }

    // Test data for null last name
    @Test
    void testContactLastNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", null, "123-4567","123 Main St.");
        });
    }

    // Test data for too long phone number
    @Test
    void testContactPhoneNumberTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", "Knope", "123-456-7890000000","123 Main St.");
        });
    }

    // Test data for null phone number
    @Test
    void testContactPhoneNumberNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", "Knope", null,"123 Main St.");
        });
    }

    // Test data for too long address
    @Test
    void testContactAddressTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", "Knope", "123-4567","12345 Main St. Pawnee, Indiana 54321");
        });
    }

    // Test data for null address
    @Test
    void testContactAddressNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("LK12345", "Leslie", "Knope", "123-4567", null);
        });
    }
    
  //Test data for Contact setters
    @Test
    public void testSetContactId() {
      Contact instance = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
      instance.setContactId("LK12345");
      assertEquals("LK12345", instance.getContactId());
    }
    
    @Test
    public void setFirstName() {
    	Contact instance = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        instance.setFirstName("Leslie");
        assertEquals("Leslie", instance.getFirstName());
    }
    
    @Test
    public void setLastName() {
    	Contact instance = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        instance.setLastName("Knope");
        assertEquals("Knope", instance.getLastName());
    }
    
    @Test
    public void setContactPhone() {
    	Contact instance = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        instance.setContactPhone("123-4567");
        assertEquals("123-4567", instance.getContactPhone());
    }
    
    @Test
    public void setContactAddress() {
    	Contact instance = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        instance.setContactAddress("123 Main St.");
        assertEquals("123 Main St.", instance.getContactAddress());
    }

}
