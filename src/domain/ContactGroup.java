package domain;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {

	int groupid;
	String groupname;
	Set<Contact> Contacts = new HashSet<Contact>();
		
	
	public ContactGroup(String groupname) {
		super();
		this.groupname = groupname;
	}
	public ContactGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public Set<Contact> getContacts() {
		return Contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		Contacts = contacts;
	}

}
