import java.util.PriorityQueue;

/**
 * Class representing a Hospital in a PriorityQueue. PriorityQueueHospital stores collection of patients waiting
 * to receive medical treatment. Patients are ordered by the natural ordering of the objects (in the case of
 * SickPersons, theis severity level). Once a patient is treated, it is removed from the Hospital.
 *
 *
 * @author Jaycie
 * @version 2019-03-12
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>{
	
	private PriorityQueue<PatientType> pq;
	
	/**
	 * Initializes the Patient PriorityQueue.
	 */
	public PriorityQueueHospital()
	{
		pq = new PriorityQueue<PatientType>();
	}
	
	/**
	 * Adds patient to PriorityQueue.
	 * 
	 * @param patient to be added
	 */
	public void addPatient(PatientType patient)
	{
		pq.add(patient);
	}
	
	/**
	 * Peeks at next patient to be treated.
	 * 
	 * @return patient to be treated
	 */
	public PatientType nextPatient()
	{
		return pq.peek();
	}
	
	/**
	 * Removes patient from PriorityQueue.
	 * 
	 * @return patient to be removed
	 */
	public PatientType treatNextPatient()
	{
		return pq.remove();
	}
	
	/**
	 * Number of patients in PriorityQueue.
	 * 
	 * @return number of patients in PriorityQueue.
	 */
	public int numPatients()
	{
		return pq.size();
	}
	
	/**
	 * Hospital type.
	 * 
	 * @return String of type of Hospital.
	 */
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	/**
	 * The toString of all patients, concatenated.
	 * 
	 * @return String all patients.
	 */
	public String allPatientInfo()
	{
		StringBuilder result = new StringBuilder("");
		pq.forEach((PatientType p) -> result.append(p.toString()));
		return result.toString();
	}

}
