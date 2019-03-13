import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	
	@Test
	public void SickPersonTest()
	{
		SickPerson p1 = new SickPerson("Jaycie", 20, 2);
		SickPerson p2 = new SickPerson("Daniel", 22, 1);
		SickPerson p3 = new SickPerson("Anna", 19, 2);
		HealthyPerson p4 = new HealthyPerson("Austin", 20, "vaccination");
		
		Assert.assertEquals("Comparison incorrect.", -1, p1.compareTo(p2), 0.001);
		Assert.assertEquals("Comparison incorrect.", 1, p2.compareTo(p1), 0.001);
		Assert.assertEquals("Comparison incorrect.", 0, p1.compareTo(p3), 0.001);
		Assert.assertEquals("Comparison incorrect.", 0, p1.compareTo(p4), 0.001);
		Assert.assertEquals(p1.getAge(), 20, 0.001);
		
		Assert.assertEquals("toString incorrect.", "Jaycie, a 20-year old. Severity level 2", p1.toString());
		Assert.assertEquals("toString incorrect.", "Daniel, a 22-year old. Severity level 1", p2.toString());
		Assert.assertEquals("toString incorrect.", "Anna, a 19-year old. Severity level 2", p3.toString());
	}
		
	@Test
	public void HealthyPersonTest()
	{
		HealthyPerson p1 = new HealthyPerson("Jaycie", 20, "check up");
		HealthyPerson p2 = new HealthyPerson("Daniel", 22, "physical");
		HealthyPerson p3 = new HealthyPerson("Anna", 19, "vaccination");
		HealthyPerson p4 = new HealthyPerson("Austin", 20, "vaccination");
		
		Assert.assertEquals("Comparison incorrect.", -1, p3.compareTo(p2), 0.001);
		Assert.assertEquals("Comparison incorrect.", 1, p1.compareTo(p3), 0.001);
		Assert.assertEquals("Comparison incorrect.", 0, p3.compareTo(p4), 0.001);
		
		Assert.assertEquals("toString incorrect.", "Jaycie, a 20-year old. In for check up", p1.toString());
		Assert.assertEquals("toString incorrect.", "Daniel, a 22-year old. In for physical", p2.toString());
		Assert.assertEquals("toString incorrect.", "Anna, a 19-year old. In for vaccination", p3.toString());
	}

}
