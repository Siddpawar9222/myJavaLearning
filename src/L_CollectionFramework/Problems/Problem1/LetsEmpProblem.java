package L_CollectionFramework.Problems.Problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetsEmpProblem {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		Employee e1 = new Employee(101, "Ketan", "Engg", 2500, LocalDate.of(2022, 12, 1));

		Employee e2 = new Employee(102, "Harshita", "Sales", 3000, LocalDate.of(2019, 12, 1));

		Employee e3 = new Employee(103, "Navin", "Quality", 4000, LocalDate.of(2018, 12, 1));

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(new Employee(104, "Suresh", "Manufacture", 5000, LocalDate.of(2015, 6, 15))); // anonymous object

		System.out.println(empList);

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to change Department(Enter 1 for Yes or 2 for No)");

		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter your id to change your department");
			int id = sc.nextInt();
			sc.nextLine();   // 1*
			System.out.println("Enter new department name");
			String dept = sc.nextLine();

			for (Employee em : empList) {
				if (em.getId() == id) {
					em.setDepartment(dept);
				}
			}
		}

		for (int i = 0; i < empList.size(); i++) {

			Employee currEmp = empList.get(i);

			LocalDate currDate = LocalDate.now();
			LocalDate doj = currEmp.getDateOfJoining();  

			int yearOfExp = doj.until(currDate).getYears();

			double currSalary = currEmp.getSalary();
			double newSalary;

			if (yearOfExp >= 3) {
				newSalary = currSalary + currSalary * 0.3 ;
			} else {
				newSalary = currSalary + currSalary * 0.2 ;
			}

			currEmp.setSalary(newSalary);

		}
		System.out.println("\nEmployee details changes with salary hike is ");
		System.out.println(empList);
		
		sc.close();

	}

}

// 1* ==> That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter," and so the call to Scanner.nextLine returns after reading that newline.
//You will encounter the similar behavior(skip the next input) when you use Scanner.nextLine after Scanner.next() or any Scanner.nextFoo method (except nextLine itself).
