import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
	
	@Test
	public void AnimalTest()
	{
		Animal ibby = new Animal("Chihuahua", 10);
		Animal coco = new Animal("Black Cat", 10);
		
		Assert.assertEquals("Breed incorrect", ibby.getBreed(), "Chihuahua");
		Assert.assertEquals("Age incorrect", ibby.getAge(), 10, 0.001);
		Assert.assertEquals("toString incorrect.", ibby.toString(), "A 10-year old Chihuahua.");
		Assert.assertEquals("compareTo incorrect", ibby.compareTo(coco), 0, 0.001);
	}

}
