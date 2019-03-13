/**
 * Class representing a HealthyPerson who will be admitted to a Hospital.
 *
 * @author Jaycie Thaemert
 * @version 2019-03-12
 */
public class HealthyPerson extends Person {

	private String reason;
	
	/**
	 * Stores the name, age, and reason of HealthyPerson.
	 *
	 * @param name The Person's name.
	 * @param age The Person's age, in years.
	 * @param reason The reason for visit.
	 */
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	/**
	 * If o is not of type HealthyPerson, return 0. Else, return (ignoring case): 
	 * (1) self's name comes "before" o's name: negative number (2) self's name 
	 * comes "after" p's name: positive number (3) names are equivalent: 0 i.e. the 
	 * natural ordering of the name strings, ignoring case - orders alphabetically.
	 * 
	 * @return int for comparison.
	 */
	protected int compareToImpl(Person p)
	{
		int result = 0;
		
		if(super.getName().charAt(0) < p.getName().charAt(0))
		{
			result = -1;
		}
		else if(super.getName().charAt(0) > p.getName().charAt(0))
		{
			result = 1;
		}
		
		return result;
	}
	
	/**
	 * Output toString for HealthyPersons. 
	 *
	 * @return the String "%s, a %d-year old. In for %d" with replacements of the Person's name, age, and reason.
	 */
	public String toString()
	{
		return super.toString() + " In for " + reason;
	}
}
