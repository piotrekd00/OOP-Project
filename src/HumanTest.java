import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class HumanTest {
    private Human human = new Human(23, "Piotr", "Dudkiewicz") {};

    @Test
    public void testGettersAndSetters() {

        assertEquals(23, human.getAge());
        assertEquals("Piotr", human.getName());
        assertEquals("Dudkiewicz", human.getSecondName());

        human.setAge(30);
        human.setName("Adam");
        human.setSecondName("Nowak");

        assertEquals(30, human.getAge());
        assertEquals("Adam", human.getName());
        assertEquals("Nowak", human.getSecondName());
    }

}
