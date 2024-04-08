//Problem Statement : 

//We have to keep a record of employees for a company. 
//The employees have an empId, department, salary and date of joining. 
//There is continuous shuffling of employees departments, so we have to change data accordingly. 
//Also, employees leave and new ones join the company. 
//It is festival time and company has decided festival bonus based on years of service.
//	- Employees with 3+ years will receive 50% (>=3 )and 
//	- employees with less than 3 years will receive 25% (<3) of their salaries in incentives. 
//	- So we have to calculate their total salaries.

//----------------------------------------------------------------------------------------

package L_CollectionFramework.Problems.Problem1;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private String department;
	private double salary;
	private LocalDate dateOfJoining;

	public Employee() {

	}

	public Employee(int id, String name, String department, double salary, LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", dateOfJoining=" + dateOfJoining + "] \n";
	}

}
