import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", 1234, 25000);
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void canGetManagerNI(){
        assertEquals(1234, developer.getNationalInsurance());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseManagerSalaryBy500(){
        developer.raiseSalary(500);
        assertEquals(25500, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(250, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotDecreaseIncomeWithRaiseSalary(){
        developer.raiseSalary(-500);
        assertEquals(25500, developer.getSalary(), 0.01);
    }

    @Test
    public void nameCanBeChanged(){
        developer.setName("Claire");
        assertEquals("Claire", developer.getName());
    }

    @Test
    public void nameCannotBeChangedToNull(){
        developer.setName("");
        assertEquals("Mike", developer.getName());
    }
}
