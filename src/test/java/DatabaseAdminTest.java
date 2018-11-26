import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sally", 4567, 23000);
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Sally", databaseAdmin.getName());
    }

    @Test
    public void canGetManagerNI(){
        assertEquals(4567, databaseAdmin.getNationalInsurance());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(23000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseManagerSalaryBy500(){
        databaseAdmin.raiseSalary(500);
        assertEquals(23500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(230, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cannotDecreaseIncomeWithRaiseSalary(){
        databaseAdmin.raiseSalary(-500);
        assertEquals(23500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void nameCanBeChanged(){
        databaseAdmin.setName("Claire");
        assertEquals("Claire", databaseAdmin.getName());
    }

    @Test
    public void nameCannotBeChangedToNull(){
        databaseAdmin.setName("");
        assertEquals("Sally", databaseAdmin.getName());
    }

}
