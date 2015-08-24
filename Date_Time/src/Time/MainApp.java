package Time;




 class Employee{
	public void netSalary(){}
	
}

class Intern extends Employee{
	public void netSalary()
	{
		System.out.println("Intern's salary");
	}
}

class Confirmed extends Employee{
	public void netSalary()
	{
		System.out.println("Confirmed employee's salary");
	}
	public void transport(){
		System.out.println("transport for confirmed employee");
	}
}

class HR{
	public Employee recruit(String empType)
	{
	 if(empType.equalsIgnoreCase("I"))
	 {	 
		 return new Intern();
	}
	 else if(empType.equalsIgnoreCase("C"))
		 {
		 return new Confirmed();
		 }
	 return null;
	}
}

class Finance {
	public void processSalary(Employee emp){
		emp.netSalary();
		 if(emp instanceof Confirmed) {
			 Confirmed conf = (Confirmed) emp;
			 conf.transport();
		 }
		
	}
}
public class MainApp {
	
	public static void main(String args[])
	{
		HR hr=new HR();
		Finance finance=new Finance();
		Employee employee=hr.recruit("c");
		if(employee!=null)
		{
			finance.processSalary(employee);
		}
	
	
	}


}