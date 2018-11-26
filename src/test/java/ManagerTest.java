import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe", 2345, 30000, "Sales");
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void canGetManagerNI(){
        assertEquals(2345, manager.getNationalInsurance());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetManagerDepartment(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseManagerSalaryBy500(){
        manager.raiseSalary(500);
        assertEquals(30500, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300, manager.payBonus(), 0.01);
    }

    @Test
    public void cannotDecreaseIncomeWithRaiseSalary(){
        manager.raiseSalary(-500);
        assertEquals(30500, manager.getSalary(), 0.01);
    }

    @Test
    public void nameCanBeChanged(){
        manager.setName("Claire");
        assertEquals("Claire", manager.getName());
    }

    @Test
    public void nameCannotBeChangedToNull(){
        manager.setName("");
        assertEquals("Joe", manager.getName());
    }
}
