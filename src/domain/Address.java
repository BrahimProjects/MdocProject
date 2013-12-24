package domain;

public class Address {

	long id;
	String Street;
	String City;
	String zip;
	String Country;

	



	public Address( String street, String zip, String country) {
		
		Street = street;
		this.zip = zip;
		Country = country;
	}

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}

	

	
}
