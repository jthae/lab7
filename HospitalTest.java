import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {
	
	@Test
	public void StackHospitalTest()
	{
		SickPerson p1 = new SickPerson("Jaycie", 20, 2);
		SickPerson p2 = new SickPerson("Daniel", 22, 1);
		StackHospital<Person> sh = new StackHospital<Person>();
		sh.addPatient(p1);
		sh.addPatient(p2);
		
		Assert.assertEquals("Next patient incorrect.", sh.nextPatient(), p2);
		Assert.assertEquals("Treat patient incorrect.", sh.treatNextPatient(), p2);
		Assert.assertEquals("numPatients incorrect.", sh.numPatients(), 1, 0.001);
		Assert.assertEquals("hospitalType incorrect.", sh.hospitalType(), "StackHospital");
		Assert.assertEquals("allPatientInfo incorrect.", sh.allPatientInfo(), p1.toString());
		Assert.assertEquals("Hospital toString incorrect.", sh.toString(), "A StackHospital-type hospital with 1 patients.");
	}
	
	@Test
	public void QueueHospitalTest()
	{
		SickPerson p1 = new SickPerson("Jaycie", 20, 2);
		SickPerson p2 = new SickPerson("Daniel", 22, 1);
		QueueHospital<Person> qh = new QueueHospital<Person>();
		qh.addPatient(p1);
		qh.addPatient(p2);
		
		Assert.assertEquals("Next patient incorrect.", qh.nextPatient(), p1);
		Assert.assertEquals("Treat patient incorrect.", qh.treatNextPatient(), p1);
		Assert.assertEquals("numPatients incorrect.", qh.numPatients(), 1, 0.001);
		Assert.assertEquals("hospitalType incorrect.", qh.hospitalType(), "QueueHospital");
		Assert.assertEquals("allPatientInfo incorrect.", qh.allPatientInfo(), p2.toString());
		Assert.assertEquals("Hospital toString incorrect.", qh.toString(), "A QueueHospital-type hospital with 1 patients.");
	}
	
	@Test
	public void PriorityQueueTest()
	{
		SickPerson p1 = new SickPerson("Jaycie", 20, 2);
		SickPerson p2 = new SickPerson("Daniel", 22, 1);
		PriorityQueueHospital<Person> pqh = new PriorityQueueHospital<Person>();
		pqh.addPatient(p1);
		pqh.addPatient(p2);
		
		Assert.assertEquals("Next patient incorrect.", pqh.nextPatient(), p1);
		Assert.assertEquals("Treat patient incorrect.", pqh.treatNextPatient(), p1);
		Assert.assertEquals("numPatients incorrect.", pqh.numPatients(), 1, 0.001);
		Assert.assertEquals("hospitalType incorrect.", pqh.hospitalType(), "PriorityQueueHospital");
		Assert.assertEquals("allPatientInfo incorrect.", pqh.allPatientInfo(), p2.toString());
		Assert.assertEquals("Hospital toString incorrect.", pqh.toString(), "A PriorityQueueHospital-type hospital with 1 patients.");
	}

}
