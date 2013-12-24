package domain;

import java.util.HashSet;
import java.util.Set;



public class Contact {

	/**
	 * @param args
	 */
	long id;
	String firstname;
	String lastname;
	String email;
	Address add;
	Set<ContactGroup> books = new HashSet<ContactGroup>();
	Set<PhoneNumber> phones = new HashSet<PhoneNumber>();
	
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Address getAdd() {
		return add;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public Set<ContactGroup> getBooks() {
		return books;
	}



	public void setBooks(Set<ContactGroup> books) {
		this.books = books;
	}



	public Set<PhoneNumber> getPhones() {
		return phones;
	}



	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}



	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}



	Contact(String firstname, String lastname, String email) {
	
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
}
