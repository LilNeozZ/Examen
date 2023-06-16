package Exo1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSalaire {
    @Test
    public void testCalculSalaireJunior() {
        Employee employee = new Employee("Corentin", "Joeffrenet", 1, "Junior");
        EmployeeManager employeeManager = new EmployeeManager();
        int SalaireSiOK = 20000;
        int SalaireReel = employeeManager.calculateSalary(employee);
        assertEquals(SalaireSiOK, SalaireReel);
    }
    @Test
    public void testCalculSalaireIntermediaire() {
        Employee employee = new Employee("Jean", "Test", 5, "Intermédiaire");
        EmployeeManager employeeManager = new EmployeeManager();
        int SalaireSiOK = 40000;
        int SalaireReel = employeeManager.calculateSalary(employee);
        assertEquals(SalaireSiOK, SalaireReel);
    }
    @Test
    public void testCalculSalaireSenior10ans() {
        Employee employee = new Employee("Jean", "Claude", 10, "Senior");
        EmployeeManager employeeManager = new EmployeeManager();
        int SalaireSiOK = 60000;
        int SalaireReel = employeeManager.calculateSalary(employee);
        assertEquals(SalaireSiOK, SalaireReel);
    }
    @Test
    public void testCalculSalaireSenior20ans() {
        Employee employee = new Employee("Jean", "Renée", 20, "Senior");
        EmployeeManager employeeManager = new EmployeeManager();
        int SalaireSiOK = 90000;
        int SalaireReel = employeeManager.calculateSalary(employee);
        assertEquals(SalaireSiOK, SalaireReel);
    }
    @Test
    public void testCalculSalaireSenior50ans() {
        Employee employee = new Employee("Elon", "Musk", 50, "Senior");
        EmployeeManager employeeManager = new EmployeeManager();
        int SalaireSiOK = 120000;
        int SalaireReel = employeeManager.calculateSalary(employee);
        assertEquals(SalaireSiOK, SalaireReel);
    }
}
