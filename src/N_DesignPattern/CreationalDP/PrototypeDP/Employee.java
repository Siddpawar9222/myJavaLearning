package N_DesignPattern.CreationalDP.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable {
    private List<String> empList ;
    public Employee(){
        this.empList=new ArrayList<>();
    }

    public Employee(List<String> empList){
        this.empList=empList;
    }

    public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
	}

    public List<String> getEmpList(){
         return this.empList;
    }

    public void setEmp(String emp){
        this.empList.add(emp);
    }

    @Override
    public String toString() {
        return "Employee [empList=" + empList + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         Employee emp =(Employee) super.clone();
         emp.empList=new ArrayList<>(this.empList);
         return emp ;
    }


}
