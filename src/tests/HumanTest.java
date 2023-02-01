package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    private Human human = new Human(23, "Piotr", "Dudkiewicz") {};

    @Test
    public void testGettersAndSetters() {

        Assert.assertEquals(23, human.getAge());
        Assert.assertEquals("Piotr", human.getName());
        Assert.assertEquals("Dudkiewicz", human.getSecondName());

        human.setAge(30);
        human.setName("Adam");
        human.setSecondName("Nowak");

        Assert.assertEquals(30, human.getAge());
        Assert.assertEquals("Adam", human.getName());
        Assert.assertEquals("Nowak", human.getSecondName());
    }

}
