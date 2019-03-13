/**
 * Class representing a SickPerson who will be admitted to a Hospital.
 *
 * @author Jaycie Thaemert
 * @version 2019-03-12
 */
public class SickPerson extends Person {
	
	private int severity;
	
	/**
	 * Stores the name, age, and severity of SickPerson.
	 *
	 * @param name The Person's name.
	 * @param age The Person's age, in years.
	 * @param severity The Person's illness severity.
	 */
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * Get Person's severity.
	 *
	 * @return Person's severity.
	 */
	private int getSeverity()
	{
		return severity;
	}
	
	/**
	 * Compare severity of SickPersons. The higher the value, the more severe the illness.
	 *
	 * @return int for comparison.
	 */
	protected int compareToImpl(Person p)
	{
		
		if(p instanceof SickPerson)
		{
			if (this.getSeverity() > ((SickPerson) p).getSeverity())
			{
				return -1;
			}
			else if(this.getSeverity() < ((SickPerson) p).getSeverity())
			{
				return 1;
			}
			else
			{
				return 0;
			}	
		}
		else
		{
			return 0;
		}
		
		
	}
	
	/**
	 * Output toString for SickPersons. 
	 *
	 * @return the String "%s, a %d-year old. Severity level %d" with replacements of the Person's name, age, and severity.
	 */
	public String toString()
	{
		return super.toString() + " Severity level " + severity;
	}
	
}
