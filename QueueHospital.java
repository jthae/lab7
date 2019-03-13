import java.util.Queue;
import java.util.LinkedList;

/**
 * Class representing a Hospital in a PriorityQueue. QueueHospital stores collection of patients waiting
 * to receive medical treatment. Patients are ordered by the FIFO queue structure, i.e. the first patient
 * in is the next one treated. Once a patient is treated, it is removed from the Hospital.
 *
 *
 * @author Jaycie
 * @version 2019-03-12
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>{

	private Queue<PatientType> queueHosp;
	
	/**
	 * Initializes the Patient Queue.
	 */
	public QueueHospital()
	{
		queueHosp = new LinkedList<>();
	}
	
	/**
	 * Adds patient to queue.
	 * 
	 * @param patient to be added
	 */
	public void addPatient(PatientType patient)
	{
		queueHosp.add(patient);
	}
	
	/**
	 * Peeks at next patient to be treated.
	 * 
	 * @return patient to be treated
	 */
	public PatientType nextPatient()
	{
		return queueHosp.peek();
	}
	
	/**
	 * Removes patient from queue.
	 * 
	 * @return patient to be removed
	 */
	public PatientType treatNextPatient()
	{
		return queueHosp.remove();
	}
	
	/**
	 * Number of patients in queue.
	 * 
	 * @return number of patients in queue.
	 */
	public int numPatients()
	{
		return queueHosp.size();
	}
	
	/**
	 * Hospital type.
	 * 
	 * @return String of type of Hospital.
	 */
	public String hospitalType()
	{
		return "QueueHospital";
	}
	
	/**
	 * The toString of all patients, concatenated.
	 * 
	 * @return String all patients.
	 */
	public String allPatientInfo()
	{
		StringBuilder result = new StringBuilder("");
		queueHosp.forEach((PatientType p) -> result.append(p.toString()));
		return result.toString();
	}
}
