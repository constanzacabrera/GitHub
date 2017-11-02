package Chap8Lab;

//Constanza Cabrera
//12.8.15

public class Address
{
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String road, String town, String st, String zipCode)
	{
		street = road;
		city = town;
		state = st;
		zip = zipCode;
	}

	public String toString()
	{
		return (street + ", " + city + ", " + state + " " + zip);
	}
}