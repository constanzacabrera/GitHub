package Chap8Lab;

//Constanza Cabrera
//12.8.15

public class Person
{
	private String lastName;
	private String firstName;
	private Address home;

	public Person(String last, String first, Address residence)
	{
		lastName = last;
		firstName = first;
		home = residence;
	}

	public Person(Person pr)
	{
		this.lastName = pr.lastName;
		this.firstName = firstName;
		this.home = pr.home;
	}

	public String toString()
	{
		return(firstName + " " + lastName + ", " + home.toString());
	}

}