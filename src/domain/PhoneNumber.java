package domain;

public class PhoneNumber {

	long idphone;
	String phoneKind;
	String phonenumber;
	Contact contact;

	public long getIdphone() {
		return idphone;
	}

	public void setIdphone(long idphone) {
		this.idphone = idphone;
	}

	public String getPhoneKind() {
		return phoneKind;
	}

	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}

	public String getPhoneumber() {
		return phonenumber;
	}

	public void setPhoneumber(String phoneumber) {
		this.phonenumber = phoneumber;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String phoneKind, String phonenumber) {
		super();
	
		this.phoneKind = phoneKind;
		this.phonenumber = phonenumber;
	}
}