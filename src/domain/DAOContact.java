package domain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;




public class DAOContact {
	
	static Session session = null;

	public DAOContact() {
		session = HibernateUtil.getSessionFactory().openSession();
	}




	
	
	
	
	public void addContact(final String firstName, final String lastName, final String email,String street, String city, String zip,String country, String phoneNumber,String phoneKind,String groupeName,String entreprisecheck,String numSiret) {	
		
		
		
		org.hibernate.Transaction tx = session.beginTransaction();
		
		if(entreprisecheck.equals("1")){
			
			Entreprise entreprise = new Entreprise();
			Address address = new Address();
			Set<Contact> contacts = new HashSet<Contact>();
			Set<ContactGroup> books = new HashSet<ContactGroup>();
			ContactGroup contactgroup = new ContactGroup(groupeName);
			PhoneNumber phone = new PhoneNumber(phoneKind,phoneNumber);
			Set<PhoneNumber> phones = new HashSet<PhoneNumber>();
			
			entreprise.setFirstname(firstName);
			entreprise.setLastname(lastName);
			entreprise.setEmail(email);
			entreprise.setAdd(address);
			
			
			address.setStreet(street);
			address.setCity(city);
			address.setZip(zip);
			address.setCountry(country);
			
			
			contacts.add(entreprise);
			books.add(contactgroup);
			entreprise.setBooks(books);
			contactgroup.setContacts(contacts);

			phones.add(phone);
			entreprise.setPhones(phones);
			phone.setContact(entreprise);
			entreprise.setNumSiret(Integer.parseInt(numSiret));
			session.persist(entreprise);
			session.save(contactgroup);
			System.out.println("Test2");

		}else{
			
			Contact contact = new Contact();
			Address address = new Address();
			Set<Contact> contacts = new HashSet<Contact>();
			Set<ContactGroup> books = new HashSet<ContactGroup>();
			ContactGroup contactgroup = new ContactGroup(groupeName);
			PhoneNumber phone = new PhoneNumber(phoneKind,phoneNumber);
			Set<PhoneNumber> phones = new HashSet<PhoneNumber>();
			
			contact.setFirstname(firstName);
			contact.setLastname(lastName);
			contact.setEmail(email);
			contact.setAdd(address);
			
			address.setStreet(street);
			address.setCity(city);
			address.setZip(zip);
			address.setCountry(country);
			
			contacts.add(contact);
			books.add(contactgroup);
			contact.setBooks(books);
			contactgroup.setContacts(contacts);

			phones.add(phone);
			contact.setPhones(phones);
			phone.setContact(contact);
			
			session.persist(contact);
			session.save(contactgroup);
			
			System.out.println("Test");
			
		}
			
		tx.commit();
	
	}

	
	
	
	
	public void deleteContact(String id){
		
		org.hibernate.Transaction tx = session.beginTransaction();
		Contact contact = (Contact) session.get(Contact.class, Long.valueOf(id));
		if(contact==null){
			return;
		}
		
		session.delete(contact);
		tx.commit();
		

	}

	public void updateContact(String id, final String firstName, final String lastName, final String email){ 	

		org.hibernate.Transaction tx = session.beginTransaction();
		Contact contact = (Contact) session.get(Contact.class, Long.valueOf(id));
		if(contact==null){
			return;
		}
		
		contact.setFirstname(firstName);
		contact.setLastname(lastName);
		contact.setEmail(email);
		
		session.update(contact);
		tx.commit();
	}

	public void searchContact(String id) {
		org.hibernate.Transaction tx = session.beginTransaction();
		Contact contact = (Contact) session.get(Contact.class, Long.valueOf(id));
		if(contact==null){
			return;
		}
		Address addre = (Address) session.get(Address.class, contact.getAdd().getId());
		
	    String firstname = contact.getFirstname();
		String lastname = contact.getLastname();
		String email = contact.getEmail();
		String street = addre.getStreet();
		String city = addre.getCity();
		String zip = addre.getZip();
		String country = addre.getCountry();
		
	
		
		System.out.println("Firstname : "+ firstname+"  Lastname : " + lastname +"  email :"+ email);
		System.out.println(street + "  "+city+" "+zip+"  "+country);
		
		
		tx.commit();
		
	}




}






