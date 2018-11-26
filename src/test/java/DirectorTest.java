import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Jane", 1234, 35000, "Sales");
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Jane", director.getName());
    }

    @Test
    public void canGetManagerNI(){
        assertEquals(1234, director.getNationalInsurance());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(35000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetManagerDepartment(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseManagerSalaryBy500(){
        director.raiseSalary(500);
        assertEquals(35500, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(700, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(3000000, director.getBudget(), 0.01);
    }

    @Test
    public void cannotDecreaseIncomeWithRaiseSalary(){
        director.raiseSalary(-500);
        assertEquals(35500, director.getSalary(), 0.01);
    }

    @Test
    public void nameCanBeChanged(){
        director.setName("Claire");
        assertEquals("Claire", director.getName());
    }

    @Test
    public void nameCannotBeChangedToNull(){
        director.setName("");
        assertEquals("Jane", director.getName());
    }
}
