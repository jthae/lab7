import java.util.Stack;

/**
 * Class representing a Hospital in a Stack. StackHospital stores collection of patients waiting
 * to receive medical treatment. Patients are ordered by the LIFO stack structure, i.e. the last
 * patient entered receives the next treatment. Once a patient is treated,
 * it is removed from the Hospital.
 *
 *
 * @author Jaycie
 * @version 2019-03-12
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class StackHospital<PatientType> extends Hospital<PatientType> {

	private Stack<PatientType> stackHosp;
	
	/**
	 * Initializes the Patient Stack.
	 */
	public StackHospital()
	{
		stackHosp = new Stack<>();
	}
	
	/**
	 * Adds patient to stack.
	 * 
	 * @param patient to be treated
	 */
	public void addPatient(PatientType patient)
	{
		stackHosp.push(patient);
	}
	
	/**
	 * Peeks at next patient to be treated.
	 * 
	 * @return patient to be added
	 */
	public PatientType nextPatient()
	{
		return stackHosp.peek();
	}
	
	/**
	 * Removes patient from stack.
	 * 
	 * @return patient to be removed
	 */
	public PatientType treatNextPatient()
	{
		return stackHosp.pop();
	}
	
	/**
	 * Number of patients in stack.
	 * 
	 * @return number of patients in stack.
	 */
	public int numPatients()
	{
		return stackHosp.size();
	}
	
	/**
	 * Hospital type.
	 * 
	 * @return String of type of Hospital.
	 */
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	/**
	 * The toString of all patients, concatenated.
	 * 
	 * @return String all patients.
	 */
	public String allPatientInfo()
	{
		StringBuilder result = new StringBuilder("");
		stackHosp.forEach((PatientType p) -> result.append(p.toString()));
		return result.toString();
	}
}
